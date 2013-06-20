package org.bouncycastle.crypto.tls;

public class MaxFragmentLength
{
    /*
     * RFC 3546 3.2.
     */
    public static short pow2_9 = 1;
    public static short pow2_10 = 2;
    public static short pow2_11 = 3;
    public static short pow2_12 = 4;

    public static boolean isValid(short s)
    {
        return s >= pow2_9 && s <= pow2_12;
    }
}
