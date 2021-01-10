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
LIC_FILES_CHKSUM = "file://COPYING;md5=0c7051aef9219dc7237f206c5c4179a7"

SRC_URI = "http://ftp.gnu.org/gnu/inetutils/inetutils-${PV}.tar.gz \
	file://0001-ftpd-telnetd-Fix-multiple-definitions-of-errcatch-an.patch \
"
SRC_URI[md5sum] = "04852c26c47cc8c6b825f2b74f191f52"
SRC_URI[sha1sum] = "defae98a27c0e9516c4ef2321a374a3645adb3b9"
SRC_URI[sha256sum] = "be8f75eff936b8e41b112462db51adf689715658a1b09e0d6b05d11ec92cc616"
SRC_URI[sha384sum] = "bd64bf8a4cc5716dbb59867dbc2712078ad1ba2edf18f06771a9f91822d37231600ed3df2cc30ef5b3766accf8373dd1"
SRC_URI[sha512sum] = "8074eb230c64d8fb0f3a20825b9329e5648b81941bb3441c5ffe2661c428f93fe2bac222d5334e75ef182083124c4bc5d7ebf8090ed667e4ae33b9aaacbc6dcb"

S = "${WORKDIR}/inetutils-${PV}"

# NOTE: the following prog dependencies are unknown, ignoring: mktemp netstat dd
# NOTE: the following library dependencies are unknown, ignoring: pam krb des
#       (this is based on recipes that have previously been built and packaged)
DEPENDS = "libxcrypt bison-native tcp-wrappers help2man"

# NOTE: if this software is not capable of being built in a separate build directory
# from the source, you should replace autotools with autotools-brokensep in the
# inherit line
inherit autotools

# Specify any options you want to pass to the configure script using EXTRA_OECONF:
EXTRA_OECONF = ""

