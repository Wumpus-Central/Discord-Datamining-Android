.class Lcom/facebook/react/modules/core/ChoreographerCompat$FrameCallback$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/modules/core/ChoreographerCompat$FrameCallback;->getRunnable()Ljava/lang/Runnable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/react/modules/core/ChoreographerCompat$FrameCallback;


# direct methods
.method constructor <init>(Lcom/facebook/react/modules/core/ChoreographerCompat$FrameCallback;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/modules/core/ChoreographerCompat$FrameCallback$2;->this$0:Lcom/facebook/react/modules/core/ChoreographerCompat$FrameCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/facebook/react/modules/core/ChoreographerCompat$FrameCallback$2;->this$0:Lcom/facebook/react/modules/core/ChoreographerCompat$FrameCallback;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/facebook/react/modules/core/ChoreographerCompat$FrameCallback;->doFrame(J)V

    return-void
.end method
