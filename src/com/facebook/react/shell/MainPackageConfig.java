package com.facebook.react.shell;

import com.facebook.imagepipeline.core.ImagePipelineConfig;

/* loaded from: classes7.dex */
public class MainPackageConfig {
    private ImagePipelineConfig mFrescoConfig;

    /* loaded from: classes7.dex */
    public static class Builder {
        private ImagePipelineConfig mFrescoConfig;

        public MainPackageConfig build() {
            return new MainPackageConfig(this);
        }

        public Builder setFrescoConfig(ImagePipelineConfig imagePipelineConfig) {
            this.mFrescoConfig = imagePipelineConfig;
            return this;
        }
    }

    public ImagePipelineConfig getFrescoConfig() {
        return this.mFrescoConfig;
    }

    private MainPackageConfig(Builder builder) {
        this.mFrescoConfig = builder.mFrescoConfig;
    }
}
