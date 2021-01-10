FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
FILESPATH_prepend := "/home/javad/workspace/YOCTO/poky/myworkspace/sources/inetutils/oe-local-files:"
# srctreebase: /home/javad/workspace/YOCTO/poky/myworkspace/sources/inetutils
EXTRA_IMAGE_FEATURES = " inetutils inetutils-telnetd"
inherit externalsrc
# NOTE: We use pn- overrides here to avoid affecting multiple variants in the case where the recipe uses BBCLASSEXTEND
EXTERNALSRC_pn-inetutils = "/home/javad/workspace/YOCTO/poky/myworkspace/sources/inetutils"

# initial_rev: f5e72d2fec65a56a10cba2434302958d444cc8c2
# commit: 0b8a682ba9468393c2c3a546e4841dffdf8dbc76
# commit: 9363a0465c04c13bf0673e5a5fe10df9837d7624
# commit: b56cfec46cd99fb81a0dd6e6c8c1302c607e6c9e
# commit: eedc09c8831ed1830c3b535ee9ad05546854ab6f
# commit: 3dcee42ca94c3b98c15b6e6a2248897bcb0f8edf
# commit: e5536c74ea97c11bf4380112b2d863f24d15f7b7
# commit: a05bb4e53c644c1697379941a8a4521aecab017e
# commit: 6db8e93d2cb78f719e7b1a21205ce8546fc888c9
