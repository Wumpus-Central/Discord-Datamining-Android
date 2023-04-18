.class public interface abstract Lcom/facebook/react/bridge/NativeModule;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Ld6/a;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/bridge/NativeModule$NativeMethod;
    }
.end annotation


# virtual methods
.method public abstract canOverrideExistingModule()Z
.end method

.method public abstract getName()Ljava/lang/String;
.end method

.method public abstract initialize()V
.end method

.method public abstract invalidate()V
.end method

.method public abstract onCatalystInstanceDestroy()V
.end method
