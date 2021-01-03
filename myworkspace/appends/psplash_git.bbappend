FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
FILESPATH_prepend := "/home/javad/workspace/YOCTO/poky/myworkspace/sources/psplash/oe-local-files:"
# srctreebase: /home/javad/workspace/YOCTO/poky/myworkspace/sources/psplash

inherit externalsrc
# NOTE: We use pn- overrides here to avoid affecting multiple variants in the case where the recipe uses BBCLASSEXTEND
EXTERNALSRC_pn-psplash = "/home/javad/workspace/YOCTO/poky/myworkspace/sources/psplash"

# initial_rev: 0a902f7cd875ccf018456451be369f05fa55f962
