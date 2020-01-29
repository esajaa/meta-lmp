FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append_orange-pi-pc = " \
    file://defconfig \
"
