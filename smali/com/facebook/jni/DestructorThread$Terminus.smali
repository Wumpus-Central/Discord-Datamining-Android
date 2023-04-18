.class Lcom/facebook/jni/DestructorThread$Terminus;
.super Lcom/facebook/jni/DestructorThread$Destructor;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/jni/DestructorThread;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "Terminus"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lcom/facebook/jni/DestructorThread$Destructor;-><init>(Lcom/facebook/jni/DestructorThread$1;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/jni/DestructorThread$1;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/facebook/jni/DestructorThread$Terminus;-><init>()V

    return-void
.end method


# virtual methods
.method protected destruct()V
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot destroy Terminus Destructor."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
