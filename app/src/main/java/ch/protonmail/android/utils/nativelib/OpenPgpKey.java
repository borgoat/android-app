// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from open_pgp.djinni

package ch.protonmail.android.utils.nativelib;

import androidx.annotation.NonNull;

public final class OpenPgpKey {

    /*package*/ private final String mKeyId;

    /*package*/ private final String mPublicKey;

    /*package*/ private final String mPrivateKey;

    /*package*/ private final String mFingerPrint;

    /*package*/ private final boolean mIsUpdated;

    public OpenPgpKey(@NonNull String keyId, @NonNull String publicKey, @NonNull String privateKey,
                      @NonNull String fingerPrint, boolean isUpdated) {
        this.mKeyId = keyId;
        this.mPublicKey = publicKey;
        this.mPrivateKey = privateKey;
        this.mFingerPrint = fingerPrint;
        this.mIsUpdated = isUpdated;
    }

    @NonNull
    public String getKeyId() {
        return mKeyId;
    }

    @NonNull
    public String getPublicKey() {
        return mPublicKey;
    }

    @NonNull
    public String getPrivateKey() {
        return mPrivateKey;
    }

    @NonNull
    public String getFingerPrint() {
        return mFingerPrint;
    }

    /**
     * false default only used when update keys
     */
    public boolean getIsUpdated() {
        return mIsUpdated;
    }

    @Override
    public String toString() {
        return "OpenPgpKey{" + "mKeyId=" + mKeyId + "," + "mPublicKey=" + mPublicKey + "," + "mPrivateKey="
            + mPrivateKey + "," + "mFingerPrint=" + mFingerPrint + "," + "mIsUpdated=" + mIsUpdated + "}";
    }

}
