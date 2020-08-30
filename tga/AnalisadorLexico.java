// DO NOT EDIT
// Generated by JFlex 1.8.2 http://jflex.de/
// source: tga.flex

/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * Trabalho GA Tradutores - UNISINOS                                       *
 * Karolina Pacheco                                                        *
 * Nadine Schneider                                                        *
 * Tiago Costa                                                             *
 *                                                                         *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */


/**
   Este é o arquivo que contém as regras para geração do analisador léxico
   para o trabalho do GA da disciplina de Tradutores da UNISINOS
*/


// See https://github.com/jflex-de/jflex/issues/222
@SuppressWarnings("FallThrough")
public class AnalisadorLexico {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0, 0
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\u10ff\u0100";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\1\0\1\1\1\3\22\0\1\1"+
    "\1\4\1\5\3\0\1\6\1\0\2\7\1\10\1\11"+
    "\1\7\1\11\1\12\1\13\12\14\1\0\1\7\1\15"+
    "\1\16\1\15\2\0\13\17\1\20\1\17\1\21\6\17"+
    "\1\22\5\17\1\7\1\0\1\7\3\0\1\23\1\24"+
    "\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\17"+
    "\1\34\1\35\1\17\1\36\1\37\2\17\1\40\1\41"+
    "\1\42\1\43\1\44\1\45\3\17\1\7\1\46\1\7"+
    "\u0182\0";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[512];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\2\2\3\1\1\3\2\4\1\5\1\6"+
    "\1\3\15\7\1\1\1\6\1\0\1\10\1\11\1\0"+
    "\1\2\1\0\4\7\1\12\2\7\1\12\7\7\2\0"+
    "\1\5\13\7\1\0\7\7";

  private static int [] zzUnpackAction() {
    int [] result = new int[71];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\47\0\47\0\116\0\165\0\234\0\303\0\47"+
    "\0\47\0\352\0\u0111\0\165\0\165\0\u0138\0\u015f\0\u0186"+
    "\0\u01ad\0\u01d4\0\u01fb\0\u0222\0\u0249\0\u0270\0\u0297\0\u02be"+
    "\0\u02e5\0\u030c\0\u0333\0\47\0\234\0\47\0\47\0\u035a"+
    "\0\u0381\0\u03a8\0\u03cf\0\u03f6\0\u041d\0\u0444\0\u046b\0\u0492"+
    "\0\u04b9\0\u0138\0\u04e0\0\u0507\0\u052e\0\u0555\0\u057c\0\u05a3"+
    "\0\u05ca\0\u05f1\0\u0618\0\u03a8\0\u063f\0\u0666\0\u068d\0\u06b4"+
    "\0\u06db\0\u0702\0\u0729\0\u0750\0\u0777\0\u079e\0\u07c5\0\u07ec"+
    "\0\u0813\0\u083a\0\u0861\0\u0888\0\u08af\0\u08d6\0\u08fd";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[71];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\2\3\1\4\1\5\1\6\1\7\1\10\2\11"+
    "\1\10\1\12\1\13\1\14\1\15\2\16\1\17\2\16"+
    "\1\20\1\21\1\22\1\23\1\24\2\16\1\25\2\16"+
    "\1\26\1\16\1\27\1\30\2\16\1\31\1\32\1\33"+
    "\51\0\1\3\62\0\1\34\30\0\5\35\1\36\41\35"+
    "\6\0\1\37\50\0\1\40\2\0\1\41\45\0\1\42"+
    "\1\0\1\13\46\0\1\16\2\0\27\16\15\0\1\16"+
    "\2\0\3\16\1\43\23\16\15\0\1\16\2\0\20\16"+
    "\1\44\1\45\5\16\15\0\1\16\2\0\4\16\1\46"+
    "\22\16\15\0\1\16\2\0\20\16\1\47\6\16\15\0"+
    "\1\16\2\0\16\16\1\46\10\16\15\0\1\16\2\0"+
    "\16\16\1\50\1\16\1\51\6\16\15\0\1\16\2\0"+
    "\11\16\1\52\5\16\1\53\7\16\15\0\1\16\2\0"+
    "\24\16\1\54\2\16\15\0\1\16\2\0\10\16\1\55"+
    "\16\16\15\0\1\16\2\0\23\16\1\56\2\16\1\57"+
    "\15\0\1\16\2\0\20\16\1\60\6\16\15\0\1\16"+
    "\2\0\13\16\1\61\13\16\47\0\1\37\10\62\1\63"+
    "\36\62\2\41\1\3\1\4\43\41\14\0\1\64\46\0"+
    "\1\16\2\0\1\16\1\65\25\16\15\0\1\16\2\0"+
    "\20\16\1\66\6\16\15\0\1\16\2\0\10\16\1\67"+
    "\16\16\15\0\1\16\2\0\22\16\1\70\4\16\15\0"+
    "\1\16\2\0\24\16\1\71\2\16\15\0\1\16\2\0"+
    "\20\16\1\72\6\16\15\0\1\16\2\0\21\16\1\52"+
    "\5\16\15\0\1\16\2\0\23\16\1\52\3\16\15\0"+
    "\1\16\2\0\16\16\1\66\10\16\15\0\1\16\2\0"+
    "\23\16\1\73\3\16\15\0\1\16\2\0\21\16\1\74"+
    "\5\16\15\0\1\16\2\0\14\16\1\75\12\16\15\0"+
    "\1\16\2\0\14\16\1\76\12\16\15\0\1\16\2\0"+
    "\14\16\1\77\12\16\1\0\10\62\1\100\36\62\10\0"+
    "\1\63\2\0\1\3\47\0\1\16\2\0\1\16\1\52"+
    "\25\16\15\0\1\16\2\0\16\16\1\52\10\16\15\0"+
    "\1\16\2\0\4\16\1\101\22\16\15\0\1\16\2\0"+
    "\10\16\1\52\16\16\15\0\1\16\2\0\5\16\1\77"+
    "\21\16\15\0\1\16\2\0\4\16\1\53\22\16\15\0"+
    "\1\16\2\0\24\16\1\102\2\16\15\0\1\16\2\0"+
    "\14\16\1\103\12\16\15\0\1\16\2\0\23\16\1\104"+
    "\3\16\15\0\1\16\2\0\7\16\1\52\17\16\15\0"+
    "\1\16\2\0\16\16\1\70\10\16\1\0\10\62\1\100"+
    "\2\62\1\3\33\62\14\0\1\16\2\0\15\16\1\52"+
    "\11\16\15\0\1\16\2\0\21\16\1\105\5\16\15\0"+
    "\1\16\2\0\17\16\1\106\7\16\15\0\1\16\2\0"+
    "\6\16\1\107\20\16\15\0\1\16\2\0\17\16\1\52"+
    "\7\16\15\0\1\16\2\0\12\16\1\52\14\16\15\0"+
    "\1\16\2\0\13\16\1\52\13\16\1\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2340];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\2\11\4\1\2\11\22\1\1\11\1\0\2\11"+
    "\1\0\1\1\1\0\17\1\2\0\14\1\1\0\7\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[71];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  @SuppressWarnings("unused")
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  @SuppressWarnings("unused")
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  @SuppressWarnings("unused")
  private boolean zzEOFDone;

  /* user code: */
  private void writeOtherChar(String value) {
  	switch(value){
  		case "=":
  			System.out.println("[equal, " + yytext() + "]"); 
  			break;
  		case "(":
  			System.out.println("[l_paren, " + yytext() + "]"); 
  			break;
  		case ")":
  			System.out.println("[r_paren, " + yytext() + "]"); 
  			break;
  		case "[":
  			System.out.println("[l_bracket, " + yytext() + "]"); 
  			break;
  		case "]":
  			System.out.println("[r_bracket, " + yytext() + "]"); 
  			break;
      case "{":
        System.out.println("[l_braces, " + yytext() + "]"); 
        break;
      case "}":
        System.out.println("[r_braces, " + yytext() + "]"); 
        break;
  		case ",":
  			System.out.println("[comma, " + yytext() + "]"); 
  			break;
  		case ";":
  			System.out.println("[semicolon, " + yytext() + "]"); 
  			break;
      case ".":
        System.out.println("[dot, " + yytext() + "]"); 
        break;
  	}
  }

  private String getFormattedString(String text) {
    String withoutQuotes = text.replaceAll("\"", "");
    return withoutQuotes.replaceAll("\\s+", " ");
  }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public AnalisadorLexico(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length * 2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException(
          "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE) {
      zzBuffer = new char[ZZ_BUFFERSIZE];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  public int yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return YYEOF;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { System.out.println("Illegal character <" + yytext() + ">");
            }
            // fall through
          case 11: break;
          case 2:
            { /* ignore */
            }
            // fall through
          case 12: break;
          case 3:
            { writeOtherChar(yytext());
            }
            // fall through
          case 13: break;
          case 4:
            { System.out.println("[arithmetic_operator, " + yytext() + "]");
            }
            // fall through
          case 14: break;
          case 5:
            { System.out.println("[num, " + yytext() + "]");
            }
            // fall through
          case 15: break;
          case 6:
            { System.out.println("[relational_operator, " + yytext() + "]");
            }
            // fall through
          case 16: break;
          case 7:
            { System.out.println("identificador: " + yytext());
            }
            // fall through
          case 17: break;
          case 8:
            { System.out.println("[string_literal, " + getFormattedString(yytext()) + "]");
            }
            // fall through
          case 18: break;
          case 9:
            { System.out.println("[logical_operator, " + yytext() + "]");
            }
            // fall through
          case 19: break;
          case 10:
            { System.out.println("[reserved_word, " + yytext() + "]");
            }
            // fall through
          case 20: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }

  /**
   * Runs the scanner on input files.
   *
   * This is a standalone scanner, it will print any unmatched
   * text to System.out unchanged.
   *
   * @param argv   the command line, contains the filenames to run
   *               the scanner on.
   */
  public static void main(String[] argv) {
    if (argv.length == 0) {
      System.out.println("Usage : java AnalisadorLexico [ --encoding <name> ] <inputfile(s)>");
    }
    else {
      int firstFilePos = 0;
      String encodingName = "UTF-8";
      if (argv[0].equals("--encoding")) {
        firstFilePos = 2;
        encodingName = argv[1];
        try {
          // Side-effect: is encodingName valid?
          java.nio.charset.Charset.forName(encodingName);
        } catch (Exception e) {
          System.out.println("Invalid encoding '" + encodingName + "'");
          return;
        }
      }
      for (int i = firstFilePos; i < argv.length; i++) {
        AnalisadorLexico scanner = null;
        try {
          java.io.FileInputStream stream = new java.io.FileInputStream(argv[i]);
          java.io.Reader reader = new java.io.InputStreamReader(stream, encodingName);
          scanner = new AnalisadorLexico(reader);
          while ( !scanner.zzAtEOF ) scanner.yylex();
        }
        catch (java.io.FileNotFoundException e) {
          System.out.println("File not found : \""+argv[i]+"\"");
        }
        catch (java.io.IOException e) {
          System.out.println("IO error scanning file \""+argv[i]+"\"");
          System.out.println(e);
        }
        catch (Exception e) {
          System.out.println("Unexpected exception:");
          e.printStackTrace();
        }
      }
    }
  }


}
