# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# NOTE: multiple licenses have been detected; they have been separated with &
# in the LICENSE value for now since it is a reasonable assumption that all
# of the licenses apply. If instead there is a choice between the multiple
# licenses then you should change the value to separate the licenses with |
# instead of &. If there is any doubt, check the accompanying documentation
# to determine which situation is applicable.
LICENSE = "LGPLv2.1 & GPLv2"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c \
                    file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SECTION = "libs"
SRC_URI = "https://github.com/libfuse/libfuse/releases/download/fuse-${PV}/fuse-${PV}.tar.gz"
SRC_URI[md5sum] = "8000410aadc9231fd48495f7642f3312"
SRC_URI[sha1sum] = "943ba651b14bc4a3c6fd959ed4b8c04f4a59032d"
SRC_URI[sha256sum] = "d0e69d5d608cc22ff4843791ad097f554dd32540ddc9bed7638cc6fea7c1b4b5"
SRC_URI[sha384sum] = "18f3c235c0bf37eece18e060a25d2172096d5346f1e0c7e2ac3e810220a8c49bcb74bda476516b786351c70daf38860c"
SRC_URI[sha512sum] = "3d82fafd04f2924299bb09d2bb144935fa004a43fb9a6568e2e1cc5a60fded2efa1711029a0d7f12b3e6e4501f7217f2ee3545646d89da8dece083cb390f23e2"

# NOTE: if this software is not capable of being built in a separate build directory
# from the source, you should replace autotools with autotools-brokensep in the
# inherit line
inherit autotools pkgconfig update-rc.d

# SYSV INIT script settings
INITSCRIPT_NAME = "fuse"
INITSCRIPT_PARAMS = "start 3 S . stop 20 0 6 ."
DEPENDS = "gettext-native"

PACKAGES =+ "fuse-utils libulockmgr libulockmgr-dev"

RPROVIDES_${PN}-dbg += "fuse-utils-dbg libulockmgr-dbg"

RRECOMMENDS_${PN}_class-target = "kernel-module-fuse libulockmgr fuse-utils"

FILES_${PN} += "${libdir}/libfuse.so.*"
FILES_${PN}-dev += "${libdir}/libfuse*.la"

FILES_libulockmgr = "${libdir}/libulockmgr.so.*"
FILES_libulockmgr-dev += "${libdir}/libulock*.la"

# Forbid auto-renaming to libfuse-utils
FILES_fuse-utils = "${bindir} ${base_sbindir}"
DEBIAN_NOAUTONAME_fuse-utils = "1"
DEBIAN_NOAUTONAME_${PN}-dbg = "1"

do_configure_prepend() {
    # Make this explicit so overriding base_sbindir propagates properly.
    export MOUNT_FUSE_PATH="${base_sbindir}"
}

do_install_append() {
    rm -rf ${D}/dev

    # systemd class remove the sysv_initddir only if systemd_system_unitdir
    # contains anything, but it's not needed if sysvinit is not in DISTRO_FEATURES
    if ${@bb.utils.contains('DISTRO_FEATURES', 'sysvinit', 'false', 'true', d)}; then
        rm -rf ${D}${sysconfdir}/init.d/
    fi

    # Install systemd related configuration file
    if ${@bb.utils.contains('DISTRO_FEATURES', 'systemd', 'true', 'false', d)}; then
        install -d ${D}${sysconfdir}/modules-load.d
        install -m 0644 ${WORKDIR}/fuse.conf ${D}${sysconfdir}/modules-load.d
    fi
}

do_install_append_class-nativesdk() {
    install -d ${D}${sysconfdir}
    mv ${D}/etc/* ${D}${sysconfdir}/
    rmdir ${D}/etc
}

BBCLASSEXTEND = "native nativesdk"

