.class abstract Lcom/facebook/react/animated/NativeAnimatedModule$UIThreadOperation;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/animated/NativeAnimatedModule;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x402
    name = "UIThreadOperation"
.end annotation


# instance fields
.field mBatchNumber:J

.field final synthetic this$0:Lcom/facebook/react/animated/NativeAnimatedModule;


# direct methods
.method private constructor <init>(Lcom/facebook/react/animated/NativeAnimatedModule;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lcom/facebook/react/animated/NativeAnimatedModule$UIThreadOperation;->this$0:Lcom/facebook/react/animated/NativeAnimatedModule;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, -0x1

    .line 2
    iput-wide v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule$UIThreadOperation;->mBatchNumber:J

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/react/animated/NativeAnimatedModule;Lcom/facebook/react/animated/NativeAnimatedModule$1;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Lcom/facebook/react/animated/NativeAnimatedModule$UIThreadOperation;-><init>(Lcom/facebook/react/animated/NativeAnimatedModule;)V

    return-void
.end method


# virtual methods
.method abstract execute(Lcom/facebook/react/animated/NativeAnimatedNodesManager;)V
.end method

.method public getBatchNumber()J
    .locals 2

    iget-wide v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule$UIThreadOperation;->mBatchNumber:J

    return-wide v0
.end method

.method public setBatchNumber(J)V
    .locals 0

    iput-wide p1, p0, Lcom/facebook/react/animated/NativeAnimatedModule$UIThreadOperation;->mBatchNumber:J

    return-void
.end method
