/* Generated By:JavaCC: Do not edit this line. JasonGrammarTokenManager.java */
package jason;
import semantics.SemanticAnalyser;

/** Token Manager. */
public class JasonGrammarTokenManager implements JasonGrammarConstants
{

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_0(int pos, long active0, long active1)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x7ffffffc00L) != 0L)
         {
            jjmatchedKind = 44;
            return 1;
         }
         if ((active0 & 0x800000000000L) != 0L)
            return 3;
         return -1;
      case 1:
         if ((active0 & 0x240000L) != 0L)
            return 1;
         if ((active0 & 0x7fffdbfc00L) != 0L)
         {
            jjmatchedKind = 44;
            jjmatchedPos = 1;
            return 1;
         }
         return -1;
      case 2:
         if ((active0 & 0x5170000800L) != 0L)
            return 1;
         if ((active0 & 0x2e8fdbf400L) != 0L)
         {
            if (jjmatchedPos != 2)
            {
               jjmatchedKind = 44;
               jjmatchedPos = 2;
            }
            return 1;
         }
         return -1;
      case 3:
         if ((active0 & 0x20b8000L) != 0L)
            return 1;
         if ((active0 & 0x3f9dd07c00L) != 0L)
         {
            jjmatchedKind = 44;
            jjmatchedPos = 3;
            return 1;
         }
         return -1;
      case 4:
         if ((active0 & 0x981102400L) != 0L)
            return 1;
         if ((active0 & 0x361cc05800L) != 0L)
         {
            jjmatchedKind = 44;
            jjmatchedPos = 4;
            return 1;
         }
         return -1;
      case 5:
         if ((active0 & 0x2408800000L) != 0L)
            return 1;
         if ((active0 & 0x1214405800L) != 0L)
         {
            if (jjmatchedPos != 5)
            {
               jjmatchedKind = 44;
               jjmatchedPos = 5;
            }
            return 1;
         }
         return -1;
      case 6:
         if ((active0 & 0x2000401000L) != 0L)
            return 1;
         if ((active0 & 0x1214004800L) != 0L)
         {
            jjmatchedKind = 44;
            jjmatchedPos = 6;
            return 1;
         }
         return -1;
      case 7:
         if ((active0 & 0x214000000L) != 0L)
         {
            jjmatchedKind = 44;
            jjmatchedPos = 7;
            return 1;
         }
         if ((active0 & 0x1000004800L) != 0L)
            return 1;
         return -1;
      case 8:
         if ((active0 & 0x4000000L) != 0L)
         {
            jjmatchedKind = 44;
            jjmatchedPos = 8;
            return 1;
         }
         if ((active0 & 0x210000000L) != 0L)
            return 1;
         return -1;
      default :
         return -1;
   }
}
private static final int jjStartNfa_0(int pos, long active0, long active1)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0, active1), pos + 1);
}
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 33:
         return jjStopAtPos(0, 57);
      case 34:
         return jjStopAtPos(0, 41);
      case 38:
         return jjStopAtPos(0, 62);
      case 40:
         return jjStopAtPos(0, 50);
      case 41:
         return jjStopAtPos(0, 51);
      case 42:
         return jjStopAtPos(0, 60);
      case 43:
         return jjStopAtPos(0, 58);
      case 44:
         return jjStopAtPos(0, 49);
      case 45:
         return jjStopAtPos(0, 59);
      case 46:
         return jjStartNfaWithStates_0(0, 47, 3);
      case 47:
         jjmatchedKind = 61;
         return jjMoveStringLiteralDfa1_0(0x20L);
      case 59:
         return jjStopAtPos(0, 48);
      case 60:
         jjmatchedKind = 53;
         return jjMoveStringLiteralDfa1_0(0x40000000000000L);
      case 61:
         return jjStopAtPos(0, 52);
      case 62:
         jjmatchedKind = 55;
         return jjMoveStringLiteralDfa1_0(0x100000000000000L);
      case 91:
         return jjStopAtPos(0, 65);
      case 92:
         return jjStopAtPos(0, 63);
      case 93:
         return jjStopAtPos(0, 66);
      case 65:
      case 97:
         return jjMoveStringLiteralDfa1_0(0x400L);
      case 66:
      case 98:
         return jjMoveStringLiteralDfa1_0(0x2000L);
      case 67:
      case 99:
         return jjMoveStringLiteralDfa1_0(0x20000L);
      case 68:
      case 100:
         return jjMoveStringLiteralDfa1_0(0x200000L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa1_0(0x1122000800L);
      case 70:
      case 102:
         return jjMoveStringLiteralDfa1_0(0x4000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa1_0(0x440000L);
      case 80:
      case 112:
         return jjMoveStringLiteralDfa1_0(0x204001000L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa1_0(0x2008888000L);
      case 83:
      case 115:
         return jjMoveStringLiteralDfa1_0(0x440000000L);
      case 84:
      case 116:
         return jjMoveStringLiteralDfa1_0(0x110000L);
      case 85:
      case 117:
         return jjMoveStringLiteralDfa1_0(0x1000000L);
      case 86:
      case 118:
         return jjMoveStringLiteralDfa1_0(0x4010000000L);
      case 87:
      case 119:
         return jjMoveStringLiteralDfa1_0(0x880000000L);
      case 126:
         return jjStopAtPos(0, 64);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
static private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0, 0L);
      return 1;
   }
   switch(curChar)
   {
      case 42:
         if ((active0 & 0x20L) != 0L)
            return jjStopAtPos(1, 5);
         break;
      case 61:
         if ((active0 & 0x40000000000000L) != 0L)
            return jjStopAtPos(1, 54);
         else if ((active0 & 0x100000000000000L) != 0L)
            return jjStopAtPos(1, 56);
         break;
      case 65:
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x4014020000L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x204888a000L);
      case 70:
      case 102:
         if ((active0 & 0x40000L) != 0L)
            return jjStartNfaWithStates_0(1, 18, 1);
         break;
      case 72:
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x80010000L);
      case 76:
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x2000000L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x1121400800L);
      case 79:
      case 111:
         if ((active0 & 0x200000L) != 0L)
            return jjStartNfaWithStates_0(1, 21, 1);
         break;
      case 82:
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0xa00001400L);
      case 84:
      case 116:
         return jjMoveStringLiteralDfa2_0(active0, 0x400000000L);
      case 85:
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x4000L);
      case 89:
      case 121:
         return jjMoveStringLiteralDfa2_0(active0, 0x100000L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0, 0L);
}
static private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0, 0L);
      return 2;
   }
   switch(curChar)
   {
      case 65:
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x88000L);
      case 67:
      case 99:
         return jjMoveStringLiteralDfa3_0(active0, 0x800000L);
      case 68:
      case 100:
         if ((active0 & 0x20000000L) != 0L)
         {
            jjmatchedKind = 29;
            jjmatchedPos = 2;
         }
         return jjMoveStringLiteralDfa3_0(active0, 0x1100000800L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x10000L);
      case 71:
      case 103:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x880000000L);
      case 76:
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x20000L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa3_0(active0, 0x4000L);
      case 79:
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x200001000L);
      case 80:
      case 112:
         return jjMoveStringLiteralDfa3_0(active0, 0x100000L);
      case 82:
      case 114:
         if ((active0 & 0x4000000000L) != 0L)
         {
            jjmatchedKind = 38;
            jjmatchedPos = 2;
         }
         return jjMoveStringLiteralDfa3_0(active0, 0x414000400L);
      case 83:
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000000L);
      case 84:
      case 116:
         if ((active0 & 0x40000000L) != 0L)
            return jjStartNfaWithStates_0(2, 30, 1);
         return jjMoveStringLiteralDfa3_0(active0, 0x2009400000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0, 0L);
}
static private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0, 0L);
      return 3;
   }
   switch(curChar)
   {
      case 65:
      case 97:
         return jjMoveStringLiteralDfa4_0(active0, 0x4000400L);
      case 67:
      case 99:
         return jjMoveStringLiteralDfa4_0(active0, 0x200004000L);
      case 68:
      case 100:
         if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(3, 15, 1);
         break;
      case 69:
      case 101:
         if ((active0 & 0x2000000L) != 0L)
            return jjStartNfaWithStates_0(3, 25, 1);
         return jjMoveStringLiteralDfa4_0(active0, 0x500000L);
      case 71:
      case 103:
         return jjMoveStringLiteralDfa4_0(active0, 0x1000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0x511002000L);
      case 76:
      case 108:
         if ((active0 & 0x20000L) != 0L)
            return jjStartNfaWithStates_0(3, 17, 1);
         else if ((active0 & 0x80000L) != 0L)
            return jjStartNfaWithStates_0(3, 19, 1);
         return jjMoveStringLiteralDfa4_0(active0, 0x80000000L);
      case 78:
      case 110:
         if ((active0 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(3, 16, 1);
         break;
      case 79:
      case 111:
         return jjMoveStringLiteralDfa4_0(active0, 0x800000L);
      case 84:
      case 116:
         return jjMoveStringLiteralDfa4_0(active0, 0x800000000L);
      case 85:
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x3008000000L);
      case 87:
      case 119:
         return jjMoveStringLiteralDfa4_0(active0, 0x800L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0, 0L);
}
static private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0, 0L);
      return 4;
   }
   switch(curChar)
   {
      case 65:
      case 97:
         return jjMoveStringLiteralDfa5_0(active0, 0x10000000L);
      case 69:
      case 101:
         if ((active0 & 0x80000000L) != 0L)
            return jjStartNfaWithStates_0(4, 31, 1);
         else if ((active0 & 0x800000000L) != 0L)
            return jjStartNfaWithStates_0(4, 35, 1);
         return jjMoveStringLiteralDfa5_0(active0, 0x200000000L);
      case 70:
      case 102:
         if ((active0 & 0x100000000L) != 0L)
            return jjStartNfaWithStates_0(4, 32, 1);
         break;
      case 71:
      case 103:
         return jjMoveStringLiteralDfa5_0(active0, 0x400000L);
      case 72:
      case 104:
         return jjMoveStringLiteralDfa5_0(active0, 0x800L);
      case 76:
      case 108:
         if ((active0 & 0x1000000L) != 0L)
            return jjStartNfaWithStates_0(4, 24, 1);
         break;
      case 77:
      case 109:
         return jjMoveStringLiteralDfa5_0(active0, 0x4000000L);
      case 78:
      case 110:
         if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(4, 13, 1);
         return jjMoveStringLiteralDfa5_0(active0, 0x1400000000L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x2008801000L);
      case 83:
      case 115:
         if ((active0 & 0x100000L) != 0L)
            return jjStartNfaWithStates_0(4, 20, 1);
         break;
      case 84:
      case 116:
         return jjMoveStringLiteralDfa5_0(active0, 0x4000L);
      case 89:
      case 121:
         if ((active0 & 0x400L) != 0L)
            return jjStartNfaWithStates_0(4, 10, 1);
         break;
      default :
         break;
   }
   return jjStartNfa_0(3, active0, 0L);
}
static private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0, 0L);
      return 5;
   }
   switch(curChar)
   {
      case 65:
      case 97:
         return jjMoveStringLiteralDfa6_0(active0, 0x1000L);
      case 66:
      case 98:
         return jjMoveStringLiteralDfa6_0(active0, 0x10000000L);
      case 68:
      case 100:
         if ((active0 & 0x800000L) != 0L)
            return jjStartNfaWithStates_0(5, 23, 1);
         return jjMoveStringLiteralDfa6_0(active0, 0x200000000L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa6_0(active0, 0x4400000L);
      case 71:
      case 103:
         if ((active0 & 0x400000000L) != 0L)
            return jjStartNfaWithStates_0(5, 34, 1);
         break;
      case 73:
      case 105:
         return jjMoveStringLiteralDfa6_0(active0, 0x4800L);
      case 78:
      case 110:
         if ((active0 & 0x8000000L) != 0L)
         {
            jjmatchedKind = 27;
            jjmatchedPos = 5;
         }
         return jjMoveStringLiteralDfa6_0(active0, 0x2000000000L);
      case 84:
      case 116:
         return jjMoveStringLiteralDfa6_0(active0, 0x1000000000L);
      default :
         break;
   }
   return jjStartNfa_0(4, active0, 0L);
}
static private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0, 0L);
      return 6;
   }
   switch(curChar)
   {
      case 73:
      case 105:
         return jjMoveStringLiteralDfa7_0(active0, 0x1000000000L);
      case 76:
      case 108:
         return jjMoveStringLiteralDfa7_0(active0, 0x10000800L);
      case 77:
      case 109:
         if ((active0 & 0x1000L) != 0L)
            return jjStartNfaWithStates_0(6, 12, 1);
         break;
      case 79:
      case 111:
         return jjMoveStringLiteralDfa7_0(active0, 0x4000L);
      case 82:
      case 114:
         if ((active0 & 0x400000L) != 0L)
            return jjStartNfaWithStates_0(6, 22, 1);
         break;
      case 83:
      case 115:
         if ((active0 & 0x2000000000L) != 0L)
            return jjStartNfaWithStates_0(6, 37, 1);
         break;
      case 84:
      case 116:
         return jjMoveStringLiteralDfa7_0(active0, 0x4000000L);
      case 85:
      case 117:
         return jjMoveStringLiteralDfa7_0(active0, 0x200000000L);
      default :
         break;
   }
   return jjStartNfa_0(5, active0, 0L);
}
static private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0, 0L);
      return 7;
   }
   switch(curChar)
   {
      case 69:
      case 101:
         if ((active0 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(7, 11, 1);
         return jjMoveStringLiteralDfa8_0(active0, 0x14000000L);
      case 76:
      case 108:
         if ((active0 & 0x1000000000L) != 0L)
            return jjStartNfaWithStates_0(7, 36, 1);
         break;
      case 78:
      case 110:
         if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(7, 14, 1);
         break;
      case 82:
      case 114:
         return jjMoveStringLiteralDfa8_0(active0, 0x200000000L);
      default :
         break;
   }
   return jjStartNfa_0(6, active0, 0L);
}
static private int jjMoveStringLiteralDfa8_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0, 0L);
      return 8;
   }
   switch(curChar)
   {
      case 69:
      case 101:
         if ((active0 & 0x200000000L) != 0L)
            return jjStartNfaWithStates_0(8, 33, 1);
         break;
      case 82:
      case 114:
         return jjMoveStringLiteralDfa9_0(active0, 0x4000000L);
      case 83:
      case 115:
         if ((active0 & 0x10000000L) != 0L)
            return jjStartNfaWithStates_0(8, 28, 1);
         break;
      default :
         break;
   }
   return jjStartNfa_0(7, active0, 0L);
}
static private int jjMoveStringLiteralDfa9_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(7, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(8, active0, 0L);
      return 9;
   }
   switch(curChar)
   {
      case 83:
      case 115:
         if ((active0 & 0x4000000L) != 0L)
            return jjStartNfaWithStates_0(9, 26, 1);
         break;
      default :
         break;
   }
   return jjStartNfa_0(8, active0, 0L);
}
static private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 11;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 46)
                        kind = 46;
                     jjCheckNAddStates(0, 4);
                  }
                  else if (curChar == 46)
                     jjCheckNAdd(3);
                  break;
               case 1:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 44)
                     kind = 44;
                  jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 2:
                  if (curChar == 46)
                     jjCheckNAdd(3);
                  break;
               case 3:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 45)
                     kind = 45;
                  jjCheckNAdd(3);
                  break;
               case 4:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 46)
                     kind = 46;
                  jjCheckNAddStates(0, 4);
                  break;
               case 5:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(5, 6);
                  break;
               case 6:
                  if (curChar == 46 && kind > 45)
                     kind = 45;
                  break;
               case 7:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(7, 8);
                  break;
               case 8:
                  if (curChar == 46)
                     jjCheckNAdd(9);
                  break;
               case 9:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 45)
                     kind = 45;
                  jjCheckNAdd(9);
                  break;
               case 10:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 46)
                     kind = 46;
                  jjCheckNAdd(10);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
               case 1:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 44)
                     kind = 44;
                  jjCheckNAdd(1);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 11 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static private int jjMoveStringLiteralDfa0_2()
{
   return 1;
}
static private int jjMoveStringLiteralDfa0_1()
{
   switch(curChar)
   {
      case 42:
         return jjMoveStringLiteralDfa1_1(0x40L);
      case 47:
         return jjMoveStringLiteralDfa1_1(0x80L);
      default :
         return 1;
   }
}
static private int jjMoveStringLiteralDfa1_1(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 1;
   }
   switch(curChar)
   {
      case 42:
         if ((active0 & 0x80L) != 0L)
            return jjStopAtPos(1, 7);
         break;
      case 47:
         if ((active0 & 0x40L) != 0L)
            return jjStopAtPos(1, 6);
         break;
      default :
         return 2;
   }
   return 2;
}
private static final int jjStopStringLiteralDfa_3(int pos, long active0)
{
   switch (pos)
   {
      default :
         return -1;
   }
}
private static final int jjStartNfa_3(int pos, long active0)
{
   return jjMoveNfa_3(jjStopStringLiteralDfa_3(pos, active0), pos + 1);
}
static private int jjMoveStringLiteralDfa0_3()
{
   switch(curChar)
   {
      case 34:
         return jjStopAtPos(0, 39);
      default :
         return jjMoveNfa_3(0, 0);
   }
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static private int jjMoveNfa_3(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 1;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0xffffffffffffdbffL & l) != 0L)
                     kind = 40;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  kind = 40;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((jjbitVec0[i2] & l2) != 0L && kind > 40)
                     kind = 40;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 1 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   5, 6, 7, 8, 10, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, null, "\56", "\73", "\54", "\50", "\51", "\75", "\74", 
"\74\75", "\76", "\76\75", "\41", "\53", "\55", "\52", "\57", "\46", "\134", "\176", 
"\133", "\135", };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
   "COMMENT",
   "DOUBLECOMMENT",
   "STR",
};

/** Lex State array. */
public static final int[] jjnewLexState = {
   -1, -1, -1, -1, -1, 1, 0, 2, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, -1, 3, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
};
static final long[] jjtoToken = {
   0xfffff0fffffffc01L, 0x7L, 
};
static final long[] jjtoSkip = {
   0xfeL, 0x0L, 
};
static final long[] jjtoMore = {
   0x30000000300L, 0x0L, 
};
static protected SimpleCharStream input_stream;
static private final int[] jjrounds = new int[11];
static private final int[] jjstateSet = new int[22];
static protected char curChar;
/** Constructor. */
public JasonGrammarTokenManager(SimpleCharStream stream){
   if (input_stream != null)
      throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);
   input_stream = stream;
}

/** Constructor. */
public JasonGrammarTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
static private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 11; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
static public void SwitchTo(int lexState)
{
   if (lexState >= 4 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

static protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   for (;;)
   {
     switch(curLexState)
     {
       case 0:
         try { input_stream.backup(0);
            while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
               curChar = input_stream.BeginToken();
         }
         catch (java.io.IOException e1) { continue EOFLoop; }
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_0();
         break;
       case 1:
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_1();
         if (jjmatchedPos == 0 && jjmatchedKind > 8)
         {
            jjmatchedKind = 8;
         }
         break;
       case 2:
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_2();
         if (jjmatchedPos == 0 && jjmatchedKind > 9)
         {
            jjmatchedKind = 9;
         }
         break;
       case 3:
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_3();
         break;
     }
     if (jjmatchedKind != 0x7fffffff)
     {
        if (jjmatchedPos + 1 < curPos)
           input_stream.backup(curPos - jjmatchedPos - 1);
        if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
           matchedToken = jjFillToken();
       if (jjnewLexState[jjmatchedKind] != -1)
         curLexState = jjnewLexState[jjmatchedKind];
           return matchedToken;
        }
        else if ((jjtoSkip[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
         if (jjnewLexState[jjmatchedKind] != -1)
           curLexState = jjnewLexState[jjmatchedKind];
           continue EOFLoop;
        }
      if (jjnewLexState[jjmatchedKind] != -1)
        curLexState = jjnewLexState[jjmatchedKind];
        curPos = 0;
        jjmatchedKind = 0x7fffffff;
        try {
           curChar = input_stream.readChar();
           continue;
        }
        catch (java.io.IOException e1) { }
     }
     int error_line = input_stream.getEndLine();
     int error_column = input_stream.getEndColumn();
     String error_after = null;
     boolean EOFSeen = false;
     try { input_stream.readChar(); input_stream.backup(1); }
     catch (java.io.IOException e1) {
        EOFSeen = true;
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
        if (curChar == '\n' || curChar == '\r') {
           error_line++;
           error_column = 0;
        }
        else
           error_column++;
     }
     if (!EOFSeen) {
        input_stream.backup(1);
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
     }
     throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
   }
  }
}

static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

static private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}
