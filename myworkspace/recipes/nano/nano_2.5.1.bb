# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   COPYING.DOC
#
# NOTE: multiple licenses have been detected; they have been separated with &
# in the LICENSE value for now since it is a reasonable assumption that all
# of the licenses apply. If instead there is a choice between the multiple
# licenses then you should change the value to separate the licenses with |
# instead of &. If there is any doubt, check the accompanying documentation
# to determine which situation is applicable.
LICENSE = "Unknown & GPLv3"
LIC_FILES_CHKSUM = "file://COPYING.DOC;md5=ad1419ecc56e060eccf8184a87c4285f \
                    file://COPYING;md5=f27defe1e96c2e1ecd4e0c9be8967949"

SRC_URI = "http://www.nano-editor.org/dist/v2.5/nano-${PV}.tar.gz"
SRC_URI[md5sum] = "f25c7da9813ae5f1df7e5dd1072de4ce"
SRC_URI[sha1sum] = "c8ba203be710edc11e65d484ab64a1761a72460b"
SRC_URI[sha256sum] = "e06fca01bf183f4d531aa65a28dffc0e2d10185239909eb3de797023f3453bde"
SRC_URI[sha384sum] = "337269ecba4f06ac00a553cf65e4a45f7e8563ade75ad1187bcdc44a16c93a4c3fbac9e2c50eecdf34092f2ce8fb06b3"
SRC_URI[sha512sum] = "911caebf953992336880613592848f046338c533b55fb626dca44b8b57ca127068abd7d250671bb2c82e27827bb9bc320fe84a487bedca0c7ed6aaa4bb73258a"

# NOTE: the following library dependencies are unknown, ignoring: magic curses
#       (this is based on recipes that have previously been built and packaged)
DEPENDS = "glib-2.0 zlib ncurses"

# NOTE: if this software is not capable of being built in a separate build directory
# from the source, you should replace autotools with autotools-brokensep in the
# inherit line
inherit pkgconfig gettext texinfo autotools

# Specify any options you want to pass to the configure script using EXTRA_OECONF:
EXTRA_OECONF = ""

