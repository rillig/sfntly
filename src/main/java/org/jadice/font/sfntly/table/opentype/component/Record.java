package org.jadice.font.sfntly.table.opentype.component;

import org.jadice.font.sfntly.data.WritableFontData;

interface Record {
  int writeTo(WritableFontData newData, int base);
}
