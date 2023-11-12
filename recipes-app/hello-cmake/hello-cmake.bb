LICENSE = "CLOSED"

inherit cmake

FILES_${PN} = "/hello /usr/*"

SRC_URI = "file://hello.c \
           file://CMakeLists.txt \
           "
S = "${WORKDIR}"