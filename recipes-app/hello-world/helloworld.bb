LICENSE = "CLOSED"
LIC_FILES_CHKSUM = ""

# No information for SRC_URI yet (only an external source tree was specified)
SRC_URI = "file://HelloWorld.c"

S = "${WORKDIR}"
TARGET_CC_ARCH += "${LDFLAGS}"

do_configure () {
}

do_compile () {
 ${CC} -o HelloWorld HelloWorld.c
}

do_install () {
 install -d ${D}${bindir}
 install -m 0755 HelloWorld ${D}${bindir}
}
