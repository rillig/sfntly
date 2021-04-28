package org.jadice.font.sfntly.table.opentype.contextsubst;

import org.jadice.font.sfntly.table.opentype.component.GlyphClassList;
import org.jadice.font.sfntly.data.ReadableFontData;

public class SubClassRule extends DoubleRecordTable {
  SubClassRule(ReadableFontData data, int base, boolean dataIsCanonical) {
    super(data, base, dataIsCanonical);
  }

  public GlyphClassList inputClasses() {
    return new GlyphClassList(inputGlyphs);
  }

  static class Builder extends DoubleRecordTable.Builder<SubClassRule> {
    Builder() {
      super();
    }

    Builder(SubClassRule table) {
      super(table);
    }

    Builder(ReadableFontData data, int base, boolean dataIsCanonical) {
      super(data, base, dataIsCanonical);
    }

    @Override
    protected SubClassRule subBuildTable(ReadableFontData data) {
      return new SubClassRule(data, 0, true);
    }
  }
}
