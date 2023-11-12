require recipes-core/images/core-image-minimal.bb

IMAGE_INSTALL:append = " dropbear"

IMAGE_INSTALL:append = "\
    hello \
    hello-cmake \
    "