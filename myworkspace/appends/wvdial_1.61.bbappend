FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
FILESPATH_prepend := "/home/javad/workspace/YOCTO/poky/myworkspace/sources/wvdial/oe-local-files:"
# srctreebase: /home/javad/workspace/YOCTO/poky/myworkspace/sources/wvdial

inherit externalsrc
# NOTE: We use pn- overrides here to avoid affecting multiple variants in the case where the recipe uses BBCLASSEXTEND
EXTERNALSRC_pn-wvdial = "/home/javad/workspace/YOCTO/poky/myworkspace/sources/wvdial"
EXTERNALSRC_BUILD_pn-wvdial = "/home/javad/workspace/YOCTO/poky/myworkspace/sources/wvdial"

# initial_rev: cab2d0d7954d1ce06253feee41e01aa2a6119085
# commit: b06d2ed4255bc70ea0501f6d7868f1bcb6cabb0a
# commit: 6db5835722971eb62b48ca63c20c20d48af635bc
