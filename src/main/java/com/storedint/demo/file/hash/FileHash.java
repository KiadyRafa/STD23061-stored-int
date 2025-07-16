package com.storedint.demo.file.hash;

import com.storedint.demo.PojaGenerated;

@PojaGenerated
public record FileHash(FileHashAlgorithm algorithm, String value) {}
