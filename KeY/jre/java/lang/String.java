/* This file has been generated by Stubmaker (de.uka.ilkd.stubmaker)
 * Date: Wed Nov 26 11:26:00 CET 2014
 */
package java.lang;

public final class String extends java.lang.Object implements java.io.Serializable, java.lang.Comparable, java.lang.CharSequence
{
   public final static java.util.Comparator CASE_INSENSITIVE_ORDER;


   /*@ requires true; ensures true; assignable \everything; */
   public String();

   /*@ requires true; ensures true; assignable \everything; */
   public String(java.lang.String arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public String(char[] arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public String(char[] arg0, int arg1, int arg2);

   /*@ requires true; ensures true; assignable \everything; */
   public String(int[] arg0, int arg1, int arg2);

   /*@ requires true; ensures true; assignable \everything; */
   public String(byte[] arg0, int arg1, int arg2, int arg3);

   /*@ requires true; ensures true; assignable \everything; */
   public String(byte[] arg0, int arg1);

   /*@ requires true; ensures true; assignable \everything; signals (java.io.UnsupportedEncodingException e) true; */
   public String(byte[] arg0, int arg1, int arg2, java.lang.String arg3) throws java.io.UnsupportedEncodingException;

   /*@ requires true; ensures true; assignable \everything; */
   public String(byte[] arg0, int arg1, int arg2, java.nio.charset.Charset arg3);

   /*@ requires true; ensures true; assignable \everything; signals (java.io.UnsupportedEncodingException e) true; */
   public String(byte[] arg0, java.lang.String arg1) throws java.io.UnsupportedEncodingException;

   /*@ requires true; ensures true; assignable \everything; */
   public String(byte[] arg0, java.nio.charset.Charset arg1);

   /*@ requires true; ensures true; assignable \everything; */
   public String(byte[] arg0, int arg1, int arg2);

   /*@ requires true; ensures true; assignable \everything; */
   public String(byte[] arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public String(java.lang.StringBuffer arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public String(java.lang.StringBuilder arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public int length();

   /*@ requires true; ensures true; assignable \everything; */
   public boolean isEmpty();

   /*@ requires true; ensures true; assignable \everything; */
   public char charAt(int arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public int codePointAt(int arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public int codePointBefore(int arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public int codePointCount(int arg0, int arg1);

   /*@ requires true; ensures true; assignable \everything; */
   public int offsetByCodePoints(int arg0, int arg1);

   /*@ requires true; ensures true; assignable \everything; */
   public void getChars(int arg0, int arg1, char[] arg2, int arg3);

   /*@ requires true; ensures true; assignable \everything; */
   public void getBytes(int arg0, int arg1, byte[] arg2, int arg3);

   /*@ requires true; ensures true; assignable \everything; signals (java.io.UnsupportedEncodingException e) true; */
   public byte[] getBytes(java.lang.String arg0) throws java.io.UnsupportedEncodingException;

   /*@ requires true; ensures true; assignable \everything; */
   public byte[] getBytes(java.nio.charset.Charset arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public byte[] getBytes();

   /*@ requires true; ensures true; assignable \everything; */
   public boolean equals(java.lang.Object arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public boolean contentEquals(java.lang.StringBuffer arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public boolean contentEquals(java.lang.CharSequence arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public boolean equalsIgnoreCase(java.lang.String arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public int compareTo(java.lang.String arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public int compareToIgnoreCase(java.lang.String arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public boolean regionMatches(int arg0, java.lang.String arg1, int arg2, int arg3);

   /*@ requires true; ensures true; assignable \everything; */
   public boolean regionMatches(boolean arg0, int arg1, java.lang.String arg2, int arg3, int arg4);

   /*@ requires true; ensures true; assignable \everything; */
   public boolean startsWith(java.lang.String arg0, int arg1);

   /*@ requires true; ensures true; assignable \everything; */
   public boolean startsWith(java.lang.String arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public boolean endsWith(java.lang.String arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public int hashCode();

   /*@ requires true; ensures true; assignable \everything; */
   public int indexOf(int arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public int indexOf(int arg0, int arg1);

   /*@ requires true; ensures true; assignable \everything; */
   public int lastIndexOf(int arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public int lastIndexOf(int arg0, int arg1);

   /*@ requires true; ensures true; assignable \everything; */
   public int indexOf(java.lang.String arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public int indexOf(java.lang.String arg0, int arg1);

   /*@ requires true; ensures true; assignable \everything; */
   public int lastIndexOf(java.lang.String arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public int lastIndexOf(java.lang.String arg0, int arg1);

   /*@ requires true; ensures true; assignable \everything; */
   public java.lang.String substring(int arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public java.lang.String substring(int arg0, int arg1);

   /*@ requires true; ensures true; assignable \everything; */
   public java.lang.CharSequence subSequence(int arg0, int arg1);

   /*@ requires true; ensures true; assignable \everything; */
   public java.lang.String concat(java.lang.String arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public java.lang.String replace(char arg0, char arg1);

   /*@ requires true; ensures true; assignable \everything; */
   public boolean matches(java.lang.String arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public boolean contains(java.lang.CharSequence arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public java.lang.String replaceFirst(java.lang.String arg0, java.lang.String arg1);

   /*@ requires true; ensures true; assignable \everything; */
   public java.lang.String replaceAll(java.lang.String arg0, java.lang.String arg1);

   /*@ requires true; ensures true; assignable \everything; */
   public java.lang.String replace(java.lang.CharSequence arg0, java.lang.CharSequence arg1);

   /*@ requires true; ensures true; assignable \everything; */
   public java.lang.String[] split(java.lang.String arg0, int arg1);

   /*@ requires true; ensures true; assignable \everything; */
   public java.lang.String[] split(java.lang.String arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public java.lang.String toLowerCase(java.util.Locale arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public java.lang.String toLowerCase();

   /*@ requires true; ensures true; assignable \everything; */
   public java.lang.String toUpperCase(java.util.Locale arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public java.lang.String toUpperCase();

   /*@ requires true; ensures true; assignable \everything; */
   public java.lang.String trim();

   /*@ requires true; ensures true; assignable \everything; */
   public java.lang.String toString();

   /*@ requires true; ensures true; assignable \everything; */
   public char[] toCharArray();

   /*@ requires true; ensures true; assignable \everything; */
   public static java.lang.String format(java.lang.String arg0, java.lang.Object[] arg1);

   /*@ requires true; ensures true; assignable \everything; */
   public static java.lang.String format(java.util.Locale arg0, java.lang.String arg1, java.lang.Object[] arg2);

   /*@ requires true; ensures true; assignable \everything; */
   public static java.lang.String valueOf(java.lang.Object arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public static java.lang.String valueOf(char[] arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public static java.lang.String valueOf(char[] arg0, int arg1, int arg2);

   /*@ requires true; ensures true; assignable \everything; */
   public static java.lang.String copyValueOf(char[] arg0, int arg1, int arg2);

   /*@ requires true; ensures true; assignable \everything; */
   public static java.lang.String copyValueOf(char[] arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public static java.lang.String valueOf(boolean arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public static java.lang.String valueOf(char arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public static java.lang.String valueOf(int arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public static java.lang.String valueOf(long arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public static java.lang.String valueOf(float arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public static java.lang.String valueOf(double arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public java.lang.String intern();

   /*@ requires true; ensures true; assignable \everything; */
   public int compareTo(java.lang.Object arg0);
}
