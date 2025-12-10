package org.powernukkitx.protocol.types;

public enum POICauldronUsed_Block_Interaction_TypeEnum {
  NONE,

  EXTEND,

  CLONE,

  LOCK,

  CREATE,

  CREATELOCATOR,

  RENAME,

  ITEMPLACED,

  ITEMREMOVED,

  COOKING,

  DOUSING,

  LIGHTING,

  HAYSTACK,

  FILLED,

  EMPTIED,

  ADDDYE,

  DYEITEM,

  CLEARITEM,

  ENCHANTARROW,

  COMPOSTITEMPLACED,

  RECOVEREDBONEMEAL,

  BOOKPLACED,

  BOOKOPENED,

  DISENCHANT,

  REPAIR,

  DISENCHANTANDREPAIR;

  public static POICauldronUsed_Block_Interaction_TypeEnum fromByte(int b) {
    return values()[b];
  }

  public int toByte() {
    return this.ordinal();
  }
}
