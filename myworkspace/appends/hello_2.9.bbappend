FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
FILESPATH_prepend := "/home/javad/workspace/YOCTO/poky/myworkspace/sources/hello/oe-local-files:"
# srctreebase: /home/javad/workspace/YOCTO/poky/myworkspace/sources/hello

inherit externalsrc
# NOTE: We use pn- overrides here to avoid affecting multiple variants in the case where the recipe uses BBCLASSEXTEND
EXTERNALSRC_pn-hello = "/home/javad/workspace/YOCTO/poky/myworkspace/sources/hello"

# initial_rev: c23f43784b399d66f78c046e6779ed5234248756
