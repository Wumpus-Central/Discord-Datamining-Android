package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.fabric.FabricComponents;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.fabric.events.EventEmitterWrapper;
import com.facebook.react.fabric.mounting.MountingManager;
import com.facebook.react.fabric.mounting.SurfaceMountingManager;
import com.facebook.react.uimanager.StateWrapper;
import p078e6.AbstractC6709a;
import p130h6.C7927a;
import p414x3.C13925a;

@AbstractC6709a
/* loaded from: classes7.dex */
public class IntBufferBatchMountItem implements MountItem {
    static final int INSTRUCTION_CREATE = 2;
    static final int INSTRUCTION_DELETE = 4;
    static final int INSTRUCTION_FLAG_MULTIPLE = 1;
    static final int INSTRUCTION_INSERT = 8;
    static final int INSTRUCTION_REMOVE = 16;
    static final int INSTRUCTION_REMOVE_DELETE_TREE = 2048;
    static final int INSTRUCTION_UPDATE_EVENT_EMITTER = 256;
    static final int INSTRUCTION_UPDATE_LAYOUT = 128;
    static final int INSTRUCTION_UPDATE_OVERFLOW_INSET = 1024;
    static final int INSTRUCTION_UPDATE_PADDING = 512;
    static final int INSTRUCTION_UPDATE_PROPS = 32;
    static final int INSTRUCTION_UPDATE_STATE = 64;
    static final String TAG = "IntBufferBatchMountItem";
    private final int mCommitNumber;
    private final int[] mIntBuffer;
    private final int mIntBufferLen;
    private final Object[] mObjBuffer;
    private final int mObjBufferLen;
    private final int mSurfaceId;

    public IntBufferBatchMountItem(int i, int[] iArr, Object[] objArr, int i2) {
        int i3;
        this.mSurfaceId = i;
        this.mCommitNumber = i2;
        this.mIntBuffer = iArr;
        this.mObjBuffer = objArr;
        int i4 = 0;
        if (iArr != null) {
            i3 = iArr.length;
        } else {
            i3 = 0;
        }
        this.mIntBufferLen = i3;
        this.mObjBufferLen = objArr != null ? objArr.length : i4;
    }

    private void beginMarkers(String str) {
        C7927a.m21142c(0L, "FabricUIManager::" + str);
        int i = this.mCommitNumber;
        if (i > 0) {
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_BATCH_EXECUTION_START, null, i);
        }
    }

    private static EventEmitterWrapper castToEventEmitter(Object obj) {
        if (obj != null) {
            return (EventEmitterWrapper) obj;
        }
        return null;
    }

    private static StateWrapper castToState(Object obj) {
        if (obj != null) {
            return (StateWrapper) obj;
        }
        return null;
    }

    private void endMarkers() {
        int i = this.mCommitNumber;
        if (i > 0) {
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_BATCH_EXECUTION_END, null, i);
        }
        C7927a.m21138g(0L);
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
    public void execute(MountingManager mountingManager) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        SurfaceMountingManager surfaceManager = mountingManager.getSurfaceManager(this.mSurfaceId);
        if (surfaceManager == null) {
            C13925a.m2286l(TAG, "Skipping batch of MountItems; no SurfaceMountingManager found for [%d].", Integer.valueOf(this.mSurfaceId));
        } else if (surfaceManager.isStopped()) {
            C13925a.m2286l(TAG, "Skipping batch of MountItems; was stopped [%d].", Integer.valueOf(this.mSurfaceId));
        } else {
            if (FabricUIManager.ENABLE_FABRIC_LOGS) {
                C13925a.m2295c(TAG, "Executing IntBufferBatchMountItem on surface [%d]", Integer.valueOf(this.mSurfaceId));
            }
            beginMarkers("mountViews");
            int i7 = 0;
            int i8 = 0;
            while (i7 < this.mIntBufferLen) {
                int[] iArr = this.mIntBuffer;
                int i9 = i7 + 1;
                int i10 = iArr[i7];
                int i11 = i10 & (-2);
                if ((i10 & 1) != 0) {
                    int i12 = iArr[i9];
                    i9++;
                    i = i12;
                } else {
                    i = 1;
                }
                int i13 = i8;
                i7 = i9;
                for (int i14 = 0; i14 < i; i14++) {
                    if (i11 == 2) {
                        int i15 = i13 + 1;
                        String fabricComponentName = FabricComponents.getFabricComponentName((String) this.mObjBuffer[i13]);
                        int i16 = i7 + 1;
                        int i17 = this.mIntBuffer[i7];
                        Object[] objArr = this.mObjBuffer;
                        int i18 = i15 + 1;
                        Object obj = objArr[i15];
                        int i19 = i18 + 1;
                        StateWrapper castToState = castToState(objArr[i18]);
                        i13 = i19 + 1;
                        EventEmitterWrapper castToEventEmitter = castToEventEmitter(this.mObjBuffer[i19]);
                        i5 = i16 + 1;
                        if (this.mIntBuffer[i16] == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        surfaceManager.createView(fabricComponentName, i17, obj, castToState, castToEventEmitter, z);
                    } else {
                        if (i11 == 4) {
                            surfaceManager.deleteView(this.mIntBuffer[i7]);
                            i7++;
                        } else {
                            if (i11 == 8) {
                                int[] iArr2 = this.mIntBuffer;
                                int i20 = i7 + 1;
                                int i21 = i20 + 1;
                                i6 = i21 + 1;
                                surfaceManager.addViewAt(iArr2[i20], iArr2[i7], iArr2[i21]);
                            } else if (i11 == 16) {
                                int[] iArr3 = this.mIntBuffer;
                                int i22 = i7 + 1;
                                int i23 = i22 + 1;
                                i6 = i23 + 1;
                                surfaceManager.removeViewAt(iArr3[i7], iArr3[i22], iArr3[i23]);
                            } else if (i11 == 2048) {
                                int[] iArr4 = this.mIntBuffer;
                                int i24 = i7 + 1;
                                int i25 = i24 + 1;
                                i6 = i25 + 1;
                                surfaceManager.removeDeleteTreeAt(iArr4[i7], iArr4[i24], iArr4[i25]);
                            } else {
                                if (i11 == 32) {
                                    i2 = i7 + 1;
                                    i3 = i13 + 1;
                                    surfaceManager.updateProps(this.mIntBuffer[i7], this.mObjBuffer[i13]);
                                } else if (i11 == 64) {
                                    i2 = i7 + 1;
                                    i3 = i13 + 1;
                                    surfaceManager.updateState(this.mIntBuffer[i7], castToState(this.mObjBuffer[i13]));
                                } else if (i11 == INSTRUCTION_UPDATE_LAYOUT) {
                                    int[] iArr5 = this.mIntBuffer;
                                    int i26 = i7 + 1;
                                    int i27 = iArr5[i7];
                                    int i28 = i26 + 1;
                                    int i29 = iArr5[i26];
                                    int i30 = i28 + 1;
                                    int i31 = iArr5[i28];
                                    int i32 = i30 + 1;
                                    int i33 = i32 + 1;
                                    i5 = i33 + 1;
                                    surfaceManager.updateLayout(i27, i29, i31, iArr5[i30], iArr5[i32], iArr5[i33]);
                                } else {
                                    if (i11 == INSTRUCTION_UPDATE_PADDING) {
                                        int[] iArr6 = this.mIntBuffer;
                                        int i34 = i7 + 1;
                                        int i35 = iArr6[i7];
                                        int i36 = i34 + 1;
                                        int i37 = iArr6[i34];
                                        int i38 = i36 + 1;
                                        int i39 = iArr6[i36];
                                        int i40 = i38 + 1;
                                        i4 = i40 + 1;
                                        surfaceManager.updatePadding(i35, i37, i39, iArr6[i38], iArr6[i40]);
                                    } else if (i11 == 1024) {
                                        int[] iArr7 = this.mIntBuffer;
                                        int i41 = i7 + 1;
                                        int i42 = iArr7[i7];
                                        int i43 = i41 + 1;
                                        int i44 = iArr7[i41];
                                        int i45 = i43 + 1;
                                        int i46 = iArr7[i43];
                                        int i47 = i45 + 1;
                                        i4 = i47 + 1;
                                        surfaceManager.updateOverflowInset(i42, i44, i46, iArr7[i45], iArr7[i47]);
                                    } else if (i11 == 256) {
                                        i2 = i7 + 1;
                                        i3 = i13 + 1;
                                        surfaceManager.updateEventEmitter(this.mIntBuffer[i7], castToEventEmitter(this.mObjBuffer[i13]));
                                    } else {
                                        throw new IllegalArgumentException("Invalid type argument to IntBufferBatchMountItem: " + i11 + " at index: " + i7);
                                    }
                                    i7 = i4;
                                }
                                i7 = i2;
                                i13 = i3;
                            }
                            i7 = i6;
                        }
                    }
                    i7 = i5;
                }
                i8 = i13;
            }
            surfaceManager.didUpdateViews();
            endMarkers();
        }
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
    public int getSurfaceId() {
        return this.mSurfaceId;
    }

    public boolean shouldSchedule() {
        return this.mIntBufferLen != 0;
    }

    public String toString() {
        int i;
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(String.format("IntBufferBatchMountItem [surface:%d]:\n", Integer.valueOf(this.mSurfaceId)));
            int i2 = 0;
            int i3 = 0;
            while (i2 < this.mIntBufferLen) {
                int[] iArr = this.mIntBuffer;
                i2++;
                int i4 = iArr[i2];
                int i5 = i4 & (-2);
                if ((i4 & 1) != 0) {
                    i2++;
                    i = iArr[i2];
                } else {
                    i = 1;
                }
                for (int i6 = 0; i6 < i; i6++) {
                    if (i5 == 2) {
                        int i7 = i3 + 1;
                        String fabricComponentName = FabricComponents.getFabricComponentName((String) this.mObjBuffer[i3]);
                        i3 = i7 + 3;
                        int i8 = i2 + 1;
                        i2 = i8 + 1;
                        sb2.append(String.format("CREATE [%d] - layoutable:%d - %s\n", Integer.valueOf(this.mIntBuffer[i2]), Integer.valueOf(this.mIntBuffer[i8]), fabricComponentName));
                    } else {
                        if (i5 == 4) {
                            i2++;
                            sb2.append(String.format("DELETE [%d]\n", Integer.valueOf(this.mIntBuffer[i2])));
                        } else if (i5 == 8) {
                            int i9 = i2 + 1;
                            int i10 = i9 + 1;
                            i2 = i10 + 1;
                            sb2.append(String.format("INSERT [%d]->[%d] @%d\n", Integer.valueOf(this.mIntBuffer[i2]), Integer.valueOf(this.mIntBuffer[i9]), Integer.valueOf(this.mIntBuffer[i10])));
                        } else if (i5 == 16) {
                            int i11 = i2 + 1;
                            int i12 = i11 + 1;
                            i2 = i12 + 1;
                            sb2.append(String.format("REMOVE [%d]->[%d] @%d\n", Integer.valueOf(this.mIntBuffer[i2]), Integer.valueOf(this.mIntBuffer[i11]), Integer.valueOf(this.mIntBuffer[i12])));
                        } else if (i5 == 2048) {
                            int i13 = i2 + 1;
                            int i14 = i13 + 1;
                            i2 = i14 + 1;
                            sb2.append(String.format("REMOVE+DELETE TREE [%d]->[%d] @%d\n", Integer.valueOf(this.mIntBuffer[i2]), Integer.valueOf(this.mIntBuffer[i13]), Integer.valueOf(this.mIntBuffer[i14])));
                        } else if (i5 == 32) {
                            i3++;
                            Object obj = this.mObjBuffer[i3];
                            i2++;
                            sb2.append(String.format("UPDATE PROPS [%d]: %s\n", Integer.valueOf(this.mIntBuffer[i2]), "<hidden>"));
                        } else if (i5 == 64) {
                            i3++;
                            castToState(this.mObjBuffer[i3]);
                            i2++;
                            sb2.append(String.format("UPDATE STATE [%d]: %s\n", Integer.valueOf(this.mIntBuffer[i2]), "<hidden>"));
                        } else {
                            if (i5 == INSTRUCTION_UPDATE_LAYOUT) {
                                int i15 = i2 + 1;
                                int i16 = i15 + 1;
                                int i17 = i16 + 1;
                                int i18 = i17 + 1;
                                int i19 = i18 + 1;
                                i2 = i19 + 1;
                                sb2.append(String.format("UPDATE LAYOUT [%d]: x:%d y:%d w:%d h:%d displayType:%d\n", Integer.valueOf(this.mIntBuffer[i2]), Integer.valueOf(this.mIntBuffer[i15]), Integer.valueOf(this.mIntBuffer[i16]), Integer.valueOf(this.mIntBuffer[i17]), Integer.valueOf(this.mIntBuffer[i18]), Integer.valueOf(this.mIntBuffer[i19])));
                            } else if (i5 == INSTRUCTION_UPDATE_PADDING) {
                                int i20 = i2 + 1;
                                int i21 = i20 + 1;
                                int i22 = i21 + 1;
                                int i23 = i22 + 1;
                                i2 = i23 + 1;
                                sb2.append(String.format("UPDATE PADDING [%d]: top:%d right:%d bottom:%d left:%d\n", Integer.valueOf(this.mIntBuffer[i2]), Integer.valueOf(this.mIntBuffer[i20]), Integer.valueOf(this.mIntBuffer[i21]), Integer.valueOf(this.mIntBuffer[i22]), Integer.valueOf(this.mIntBuffer[i23])));
                            } else if (i5 == 1024) {
                                int i24 = i2 + 1;
                                int i25 = i24 + 1;
                                int i26 = i25 + 1;
                                int i27 = i26 + 1;
                                i2 = i27 + 1;
                                sb2.append(String.format("UPDATE OVERFLOWINSET [%d]: left:%d top:%d right:%d bottom:%d\n", Integer.valueOf(this.mIntBuffer[i2]), Integer.valueOf(this.mIntBuffer[i24]), Integer.valueOf(this.mIntBuffer[i25]), Integer.valueOf(this.mIntBuffer[i26]), Integer.valueOf(this.mIntBuffer[i27])));
                            } else if (i5 == 256) {
                                i3++;
                                i2++;
                                sb2.append(String.format("UPDATE EVENTEMITTER [%d]\n", Integer.valueOf(this.mIntBuffer[i2])));
                            } else {
                                C13925a.m2288j(TAG, "String so far: " + sb2.toString());
                                throw new IllegalArgumentException("Invalid type argument to IntBufferBatchMountItem: " + i5 + " at index: " + i2);
                            }
                        }
                    }
                }
            }
            return sb2.toString();
        } catch (Exception e) {
            C13925a.m2287k(TAG, "Caught exception trying to print", e);
            StringBuilder sb3 = new StringBuilder();
            for (int i28 = 0; i28 < this.mIntBufferLen; i28++) {
                sb3.append(this.mIntBuffer[i28]);
                sb3.append(", ");
            }
            C13925a.m2288j(TAG, sb3.toString());
            for (int i29 = 0; i29 < this.mObjBufferLen; i29++) {
                String str = TAG;
                Object obj2 = this.mObjBuffer[i29];
                C13925a.m2288j(str, obj2 != null ? obj2.toString() : "null");
            }
            return "";
        }
    }
}
