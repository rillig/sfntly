package org.jadice.font.sfntly.table.opentype.component;

import org.jadice.font.sfntly.data.ReadableFontData;
import org.jadice.font.sfntly.data.WritableFontData;

public final class RangeRecordList extends RecordList<RangeRecord> {
  public RangeRecordList(WritableFontData data) {
    super(data);
  }

  public RangeRecordList(ReadableFontData data) {
    super(data);
  }

  public static int sizeOfListOfCount(int count) {
    return DATA_OFFSET + count * RangeRecord.RECORD_SIZE;
  }

  @Override
  protected RangeRecord getRecordAt(ReadableFontData data, int offset) {
    return new RangeRecord(data, offset);
  }

  @Override
  protected int recordSize() {
    return RangeRecord.RECORD_SIZE;
  }
}
