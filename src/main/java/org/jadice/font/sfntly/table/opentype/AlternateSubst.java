package org.jadice.font.sfntly.table.opentype;

import org.jadice.font.sfntly.data.ReadableFontData;
import org.jadice.font.sfntly.table.opentype.component.OneToManySubst;

public class AlternateSubst extends OneToManySubst {
  AlternateSubst(ReadableFontData data, int base, boolean dataIsCanonical) {
    super(data, base, dataIsCanonical);
  }
}
