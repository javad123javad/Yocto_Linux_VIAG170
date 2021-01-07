# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   pppd/plugins/radius/COPYRIGHT
#   pppd/plugins/pppoatm/COPYING
LICENSE = "Unknown"
LIC_FILES_CHKSUM = "file://pppd/plugins/radius/COPYRIGHT;md5=d939568e8bd5baf320571e4e6881400c \
                    file://pppd/plugins/pppoatm/COPYING;md5=d4e7b11df96ad750395663339b18ec80"
DEPENDS = "libpcap openssl virtual/crypt"

SRC_URI = "https://download.samba.org/pub/ppp/ppp-${PV}.tar.gz \
           file://pon \
           file://poff \
           file://init \
           file://ip-up \
           file://ip-down \
           file://08setupdns \
           file://92removedns \
           file://pap \
           file://ppp_on_boot \
           file://provider \
           "

#SRC_URI_append_libc-musl = "\
#           file://0001-Fix-build-with-musl.patch \"
SRC_URI[md5sum] = "2ca8342b9804be15103fd3f687af701c"
SRC_URI[sha1sum] = "aab5363fac3fcffa8b947aab3e89d0aab546aa08"
SRC_URI[sha256sum] = "f6bf89beae26b2943dff8f1003533d6a5a4909a0fa6edfbec44fe039bbe61bc6"
SRC_URI[sha384sum] = "931b4dac204d980e98ce8e5649355484393a9af93c2d63e2616868fdf625f8e7074535c68bec3fa8685dc19300d850c5"
SRC_URI[sha512sum] = "580a5856333e1149a66cfb218f7fb5e698f0f0c11d492d5c87b760827e76b5ef1e2e461c95d1abb368b9c92499c366e7ddb31dd3029d5a9026c3ab10b50bdbb6"



inherit autotools-brokensep 

TARGET_CC_ARCH += " ${LDFLAGS}"
EXTRA_OEMAKE = " MANDIR=${D}${datadir}/man/man8 INCDIR=${D}${includedir} LIBDIR=${D}${libdir}/pppd/${PV} BINDIR=${D}${sbindir}"
EXTRA_OECONF = "--disable-strip"

# Package Makefile computes CFLAGS, referencing COPTS.
# Typically hard-coded to '-O2 -g' in the Makefile's.
#
EXTRA_OEMAKE += ' COPTS="${CFLAGS} -I${STAGING_INCDIR}/openssl -I${S}/include"'

do_configure () {
	oe_runconf
}

do_install_append () {
	make install-etcppp ETCDIR=${D}/${sysconfdir}/ppp
	mkdir -p ${D}${bindir}/ ${D}${sysconfdir}/init.d
	mkdir -p ${D}${sysconfdir}/ppp/ip-up.d/
	mkdir -p ${D}${sysconfdir}/ppp/ip-down.d/
	install -m 0755 ${WORKDIR}/pon ${D}${bindir}/pon
	install -m 0755 ${WORKDIR}/poff ${D}${bindir}/poff
	install -m 0755 ${WORKDIR}/init ${D}${sysconfdir}/init.d/ppp
	install -m 0755 ${WORKDIR}/ip-up ${D}${sysconfdir}/ppp/
	install -m 0755 ${WORKDIR}/ip-down ${D}${sysconfdir}/ppp/
	install -m 0755 ${WORKDIR}/08setupdns ${D}${sysconfdir}/ppp/ip-up.d/
	install -m 0755 ${WORKDIR}/92removedns ${D}${sysconfdir}/ppp/ip-down.d/
	mkdir -p ${D}${sysconfdir}/chatscripts
	mkdir -p ${D}${sysconfdir}/ppp/peers
	install -m 0755 ${WORKDIR}/pap ${D}${sysconfdir}/chatscripts
	install -m 0755 ${WORKDIR}/ppp_on_boot ${D}${sysconfdir}/ppp/ppp_on_boot
	install -m 0755 ${WORKDIR}/provider ${D}${sysconfdir}/ppp/peers/provider
	rm -rf ${D}/${mandir}/man8/man8
	chmod u+s ${D}${sbindir}/pppd
	rm ${D}${sbindir}/pppdump
	rm ${D}${sbindir}/pppstats
}


CONFFILES_${PN} = "${sysconfdir}/ppp/pap-secrets ${sysconfdir}/ppp/chap-secrets ${sysconfdir}/ppp/options"
PACKAGES =+ "${PN}-oa ${PN}-oe ${PN}-radius ${PN}-winbind ${PN}-minconn ${PN}-password ${PN}-l2tp ${PN}-tools"
FILES_${PN}        = "${sysconfdir} ${bindir} ${sbindir}/chat ${sbindir}/pppd ${systemd_unitdir}/system/ppp@.service"
FILES_${PN}-oa       = "${libdir}/pppd/${PV}/pppoatm.so"
FILES_${PN}-oe       = "${sbindir}/pppoe-discovery ${libdir}/pppd/${PV}/rp-pppoe.so"
FILES_${PN}-radius   = "${libdir}/pppd/${PV}/radius.so ${libdir}/pppd/${PV}/radattr.so ${libdir}/pppd/${PV}/radrealms.so"
FILES_${PN}-winbind  = "${libdir}/pppd/${PV}/winbind.so"
FILES_${PN}-minconn  = "${libdir}/pppd/${PV}/minconn.so"
FILES_${PN}-password = "${libdir}/pppd/${PV}/pass*.so"
FILES_${PN}-l2tp     = "${libdir}/pppd/${PV}/*l2tp.so"
