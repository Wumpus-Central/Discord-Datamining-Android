package com.facebook.react.fabric;

import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class DevToolsReactPerfLogger implements ReactMarker.FabricMarkerListener {
    public static final LongStreamingStats mStreamingCommitStats = new LongStreamingStats();
    public static final LongStreamingStats mStreamingLayoutStats = new LongStreamingStats();
    public static final LongStreamingStats mStreamingDiffStats = new LongStreamingStats();
    public static final LongStreamingStats mStreamingTransactionEndStats = new LongStreamingStats();
    public static final LongStreamingStats mStreamingBatchExecutionStats = new LongStreamingStats();
    private final Map<Integer, FabricCommitPoint> mFabricCommitMarkers = new HashMap();
    private final List<DevToolsReactPerfLoggerListener> mDevToolsReactPerfLoggerListeners = new ArrayList();

    /* loaded from: classes7.dex */
    public interface DevToolsReactPerfLoggerListener {
        void onFabricCommitEnd(FabricCommitPoint fabricCommitPoint);
    }

    /* loaded from: classes7.dex */
    public static class FabricCommitPoint {
        private final long mCommitNumber;
        private final Map<ReactMarkerConstants, Long> mPoints;

        /* JADX INFO: Access modifiers changed from: private */
        public void addPoint(ReactMarkerConstants reactMarkerConstants, long j) {
            this.mPoints.put(reactMarkerConstants, Long.valueOf(j));
        }

        private long getValue(ReactMarkerConstants reactMarkerConstants) {
            Long l = this.mPoints.get(reactMarkerConstants);
            if (l != null) {
                return l.longValue();
            }
            return -1L;
        }

        public long getBatchExecutionDuration() {
            return getBatchExecutionEnd() - getBatchExecutionStart();
        }

        public long getBatchExecutionEnd() {
            return getValue(ReactMarkerConstants.FABRIC_BATCH_EXECUTION_END);
        }

        public long getBatchExecutionStart() {
            return getValue(ReactMarkerConstants.FABRIC_BATCH_EXECUTION_START);
        }

        public long getCommitDuration() {
            return getCommitEnd() - getCommitStart();
        }

        public long getCommitEnd() {
            return getValue(ReactMarkerConstants.FABRIC_COMMIT_END);
        }

        public long getCommitNumber() {
            return this.mCommitNumber;
        }

        public long getCommitStart() {
            return getValue(ReactMarkerConstants.FABRIC_COMMIT_START);
        }

        public long getDiffDuration() {
            return getDiffEnd() - getDiffStart();
        }

        public long getDiffEnd() {
            return getValue(ReactMarkerConstants.FABRIC_DIFF_END);
        }

        public long getDiffStart() {
            return getValue(ReactMarkerConstants.FABRIC_DIFF_START);
        }

        public long getFinishTransactionEnd() {
            return getValue(ReactMarkerConstants.FABRIC_FINISH_TRANSACTION_END);
        }

        public long getFinishTransactionStart() {
            return getValue(ReactMarkerConstants.FABRIC_FINISH_TRANSACTION_START);
        }

        public long getLayoutDuration() {
            return getLayoutEnd() - getLayoutStart();
        }

        public long getLayoutEnd() {
            return getValue(ReactMarkerConstants.FABRIC_LAYOUT_END);
        }

        public long getLayoutStart() {
            return getValue(ReactMarkerConstants.FABRIC_LAYOUT_START);
        }

        public long getTransactionEndDuration() {
            return getFinishTransactionEnd() - getFinishTransactionStart();
        }

        public long getUpdateUIMainThreadEnd() {
            return getValue(ReactMarkerConstants.FABRIC_UPDATE_UI_MAIN_THREAD_END);
        }

        public long getUpdateUIMainThreadStart() {
            return getValue(ReactMarkerConstants.FABRIC_UPDATE_UI_MAIN_THREAD_START);
        }

        private FabricCommitPoint(int i) {
            this.mPoints = new HashMap();
            this.mCommitNumber = i;
        }
    }

    private static boolean isFabricCommitMarker(ReactMarkerConstants reactMarkerConstants) {
        return reactMarkerConstants == ReactMarkerConstants.FABRIC_COMMIT_START || reactMarkerConstants == ReactMarkerConstants.FABRIC_COMMIT_END || reactMarkerConstants == ReactMarkerConstants.FABRIC_FINISH_TRANSACTION_START || reactMarkerConstants == ReactMarkerConstants.FABRIC_FINISH_TRANSACTION_END || reactMarkerConstants == ReactMarkerConstants.FABRIC_DIFF_START || reactMarkerConstants == ReactMarkerConstants.FABRIC_DIFF_END || reactMarkerConstants == ReactMarkerConstants.FABRIC_LAYOUT_START || reactMarkerConstants == ReactMarkerConstants.FABRIC_LAYOUT_END || reactMarkerConstants == ReactMarkerConstants.FABRIC_BATCH_EXECUTION_START || reactMarkerConstants == ReactMarkerConstants.FABRIC_BATCH_EXECUTION_END || reactMarkerConstants == ReactMarkerConstants.FABRIC_UPDATE_UI_MAIN_THREAD_START || reactMarkerConstants == ReactMarkerConstants.FABRIC_UPDATE_UI_MAIN_THREAD_END;
    }

    private void onFabricCommitEnd(FabricCommitPoint fabricCommitPoint) {
        for (DevToolsReactPerfLoggerListener devToolsReactPerfLoggerListener : this.mDevToolsReactPerfLoggerListeners) {
            devToolsReactPerfLoggerListener.onFabricCommitEnd(fabricCommitPoint);
        }
    }

    public void addDevToolsReactPerfLoggerListener(DevToolsReactPerfLoggerListener devToolsReactPerfLoggerListener) {
        this.mDevToolsReactPerfLoggerListeners.add(devToolsReactPerfLoggerListener);
    }

    @Override // com.facebook.react.bridge.ReactMarker.FabricMarkerListener
    public void logFabricMarker(ReactMarkerConstants reactMarkerConstants, String str, int i, long j) {
        if (isFabricCommitMarker(reactMarkerConstants)) {
            FabricCommitPoint fabricCommitPoint = this.mFabricCommitMarkers.get(Integer.valueOf(i));
            if (fabricCommitPoint == null) {
                fabricCommitPoint = new FabricCommitPoint(i);
                this.mFabricCommitMarkers.put(Integer.valueOf(i), fabricCommitPoint);
            }
            fabricCommitPoint.addPoint(reactMarkerConstants, j);
            if (reactMarkerConstants == ReactMarkerConstants.FABRIC_BATCH_EXECUTION_END) {
                onFabricCommitEnd(fabricCommitPoint);
                this.mFabricCommitMarkers.remove(Integer.valueOf(i));
            }
        }
    }

    public void removeDevToolsReactPerfLoggerListener(DevToolsReactPerfLoggerListener devToolsReactPerfLoggerListener) {
        this.mDevToolsReactPerfLoggerListeners.remove(devToolsReactPerfLoggerListener);
    }
}
