FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
FILESPATH_prepend := "/home/javad/workspace/YOCTO/poky/myworkspace/sources/libusb/oe-local-files:"
# srctreebase: /home/javad/workspace/YOCTO/poky/myworkspace/sources/libusb

inherit externalsrc
# NOTE: We use pn- overrides here to avoid affecting multiple variants in the case where the recipe uses BBCLASSEXTEND
EXTERNALSRC_pn-libusb = "/home/javad/workspace/YOCTO/poky/myworkspace/sources/libusb"

# initial_rev: a76989e9ac7233c10d08665c70f06e74f4237f18
