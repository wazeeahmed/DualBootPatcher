// automatically generated, do not modify

package mbtool.daemon.v3;

public final class SignedExecResult {
  private SignedExecResult() { }
  public static final short PROCESS_EXITED = 0;
  public static final short PROCESS_KILLED_BY_SIGNAL = 1;
  public static final short INVALID_SIGNATURE = 2;
  public static final short OTHER_ERROR = 3;

  private static final String[] names = { "PROCESS_EXITED", "PROCESS_KILLED_BY_SIGNAL", "INVALID_SIGNATURE", "OTHER_ERROR", };

  public static String name(int e) { return names[e]; }
};

