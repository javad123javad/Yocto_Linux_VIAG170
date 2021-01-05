# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d1aa69945aa627dfca645fcdd7b4cf8e"

SRC_URI = "https://www.sm5bsz.com/linuxdsp/archive/lir04-${PV}.tbz"
SRC_URI[md5sum] = "ffe8481c979f4fa0529c7307c1bf3ce3"
SRC_URI[sha1sum] = "43dc1286b488cdc79d10f369d7c934f67637c936"
SRC_URI[sha256sum] = "d999d7dab8284fd3701a083065aabdc655ec345e68a589669bbd28fec671b582"
SRC_URI[sha384sum] = "726aaa2d6dce82eaf955a1f44fb9062b42dae3acea940eb2d53cd1a69eca6f0096ea1a3fe9ad80051cd77fcb8746bd52"
SRC_URI[sha512sum] = "1a26635be30a51b4ffd02e3d21e118f717a2cc267929c4ff9214d76690fe7af54885b1d2fb4846a139a283c66e904445ebfbd1fed7116ebd0ad9beeaec956f99"

S = "${WORKDIR}/${BPN}-04.${PV}"

inherit cmake

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""

