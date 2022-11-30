DESCRIPTION = "Linux kernel module for NPort"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING-GPL.TXT;md5=3c34afdc3adf82d2448f12715a255122"

inherit module

SRC_URI = " \
	file://Makefile \
	file://npreal2.h \
	file://np_ver.h \
	file://npreal2.c \
	file://COPYING-GPL.TXT \
"

S = "${WORKDIR}"

# The inherit of module.bbclass will automatically name module packages with
# "kernel-module-" prefix as required by the oe-core build environment.

RPROVIDES_${PN} += "kernel-module-npreal2"



