include recipes-kernel/linux/kmeta-linux-lmp-5.10.y.inc

LINUX_VERSION ?= "5.10.33"
KBRANCH = "xlnx_v5.10.y"
SRCREV_machine = "d9b9223a798b8b4c97f1175aef013105d4b4a998"
SRCREV_meta = "${KERNEL_META_COMMIT}"

# make sure bitstream is deployed for fit-image generation
do_compile[depends] += "bitstream-extraction:do_deploy"

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

SRC_URI = "git://github.com/foundriesio/linux.git;protocol=https;branch=${KBRANCH};name=machine; \
    ${KERNEL_META_REPO};protocol=${KERNEL_META_REPO_PROTOCOL};type=kmeta;name=meta;branch=${KERNEL_META_BRANCH};destsuffix=${KMETA} \
"

KMETA = "kernel-meta"

include recipes-kernel/linux/linux-lmp.inc
