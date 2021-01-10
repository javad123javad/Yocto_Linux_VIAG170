# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   COPYING
LICENSE = "Unknown"
LIC_FILES_CHKSUM = "file://COPYING;md5=57d09285feac8a64efa878e692b14f36"

SRC_URI = "https://ftp.gnu.org/gnu/libmicrohttpd/libmicrohttpd-${PV}.tar.gz"
SRC_URI[md5sum] = "2a286193af88ab2ae3149748d4b46187"
SRC_URI[sha1sum] = "82bbb87c1cae15a0819b1899acb02006c4d24dce"
SRC_URI[sha256sum] = "0ae825f8e0d7f41201fd44a0df1cf454c1cb0bc50fe9d59c26552260264c2ff8"
SRC_URI[sha384sum] = "85fadae9d92f555306748d9577bdb0b3d74c5a3e242c44ad7433799379e1e38297c639a73a23638162a33df1f0e2c4ee"
SRC_URI[sha512sum] = "9695e2fb08785e4b60342226ef3a0af22da4d80f127e7db9ec80ce844f70d0d781b30af207d58d8eb691b85a5fe4691cb9ecf887ca86f5e059a05259ae041316"

# NOTE: the following prog dependencies are unknown, ignoring: curl zzuf socat
# NOTE: the following library dependencies are unknown, ignoring: gnutls
#       (this is based on recipes that have previously been built and packaged)

# NOTE: if this software is not capable of being built in a separate build directory
# from the source, you should replace autotools with autotools-brokensep in the
# inherit line
inherit gettext texinfo pkgconfig autotools

# Specify any options you want to pass to the configure script using EXTRA_OECONF:
EXTRA_OECONF = ""

