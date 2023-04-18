.class Lcom/facebook/react/modules/core/ChoreographerCompat$FrameCallback$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/Choreographer$FrameCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/modules/core/ChoreographerCompat$FrameCallback;->getFrameCallback()Landroid/view/Choreographer$FrameCallback;
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

    iput-object p1, p0, Lcom/facebook/react/modules/core/ChoreographerCompat$FrameCallback$1;->this$0:Lcom/facebook/react/modules/core/ChoreographerCompat$FrameCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public doFrame(J)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/modules/core/ChoreographerCompat$FrameCallback$1;->this$0:Lcom/facebook/react/modules/core/ChoreographerCompat$FrameCallback;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/react/modules/core/ChoreographerCompat$FrameCallback;->doFrame(J)V

    return-void
.end method
