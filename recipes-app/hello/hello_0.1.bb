LICENSE = "CLOSED"

SRC_URI = "file://hello.c \
           file://Makefile \
           "

S = "${WORKDIR}"
TARGET_CC_ARCH += "${LDFLAGS}"

INSANE_SKIP_${PN} += "file-rdeps"
FILES_${PN} = "/usr/*"


do_configure () {
	# Specify any needed configure commands here
	:
}

do_compile () {
	# You will almost certainly need to add additional arguments here
	oe_runmake
}

do_install () {
	install -d ${D}${bindir}
	install -m 0755 ${S}/hello ${D}${bindir}
}
