require rpb-weston-image.bb

CORE_IMAGE_BASE_INSTALL_remove = "weston-init"

CORE_IMAGE_BASE_INSTALL += " \
    weston-cfg-systemd \
    libexif \
    chromium \
    ${@base_contains('MACHINE_FEATURES', 'optee', 'optee-aes-decryptor ocdmi portmap', '', d)} \
    "
