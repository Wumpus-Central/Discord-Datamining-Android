.class public interface abstract annotation Lcom/facebook/react/surface/ReactStage;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/annotation/Annotation;


# annotations
.annotation runtime Ljava/lang/annotation/Retention;
    value = .enum Ljava/lang/annotation/RetentionPolicy;->SOURCE:Ljava/lang/annotation/RetentionPolicy;
.end annotation


# static fields
.field public static final BRIDGE_DID_LOAD:I = 0x1

.field public static final MODULE_DID_LOAD:I = 0x2

.field public static final ON_ATTACH_TO_INSTANCE:I = 0x65

.field public static final SURFACE_DID_INITIALIZE:I = 0x0

.field public static final SURFACE_DID_INITIAL_LAYOUT:I = 0x5

.field public static final SURFACE_DID_INITIAL_MOUNTING:I = 0x6

.field public static final SURFACE_DID_INITIAL_RENDERING:I = 0x4

.field public static final SURFACE_DID_RUN:I = 0x3

.field public static final SURFACE_DID_STOP:I = 0x7
