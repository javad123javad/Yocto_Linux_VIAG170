# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   debian/copyright-scan-patterns.yml
#   debian/copyright
#
# NOTE: multiple licenses have been detected; they have been separated with &
# in the LICENSE value for now since it is a reasonable assumption that all
# of the licenses apply. If instead there is a choice between the multiple
# licenses then you should change the value to separate the licenses with |
# instead of &. If there is any doubt, check the accompanying documentation
# to determine which situation is applicable.
LICENSE = "GPLv2 & Unknown"
LIC_FILES_CHKSUM = "file://COPYING;md5=751419260aa954499f7abaabaa882bbe \
                    file://debian/copyright-scan-patterns.yml;md5=411a33a123509745a20702ec5d1547bc \
                    file://debian/copyright;md5=25cbc1227195b0fc5f7cbfe48ab60f51"

SRC_URI = "git://git.osmocom.org/rtl-sdr.git"
DEPENDS = "libusb"
# Modify these as desired
PV = "1.0+git${SRCPV}"
SRCREV = "0847e93e0869feab50fd27c7afeb85d78ca04631"

S = "${WORKDIR}/git"

inherit cmake pkgconfig

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""

