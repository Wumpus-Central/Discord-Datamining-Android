.class public Lcom/facebook/jni/DestructorThread;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/jni/DestructorThread$DestructorList;,
        Lcom/facebook/jni/DestructorThread$DestructorStack;,
        Lcom/facebook/jni/DestructorThread$Terminus;,
        Lcom/facebook/jni/DestructorThread$Destructor;
    }
.end annotation


# static fields
.field private static final sDestructorList:Lcom/facebook/jni/DestructorThread$DestructorList;

.field private static final sDestructorStack:Lcom/facebook/jni/DestructorThread$DestructorStack;

.field private static final sReferenceQueue:Ljava/lang/ref/ReferenceQueue;

.field private static final sThread:Ljava/lang/Thread;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/facebook/jni/DestructorThread$DestructorStack;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/facebook/jni/DestructorThread$DestructorStack;-><init>(Lcom/facebook/jni/DestructorThread$1;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/facebook/jni/DestructorThread;->sDestructorStack:Lcom/facebook/jni/DestructorThread$DestructorStack;

    .line 8
    .line 9
    new-instance v0, Ljava/lang/ref/ReferenceQueue;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/ref/ReferenceQueue;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lcom/facebook/jni/DestructorThread;->sReferenceQueue:Ljava/lang/ref/ReferenceQueue;

    .line 15
    .line 16
    new-instance v0, Lcom/facebook/jni/DestructorThread$DestructorList;

    .line 17
    .line 18
    invoke-direct {v0}, Lcom/facebook/jni/DestructorThread$DestructorList;-><init>()V

    .line 19
    .line 20
    .line 21
    sput-object v0, Lcom/facebook/jni/DestructorThread;->sDestructorList:Lcom/facebook/jni/DestructorThread$DestructorList;

    .line 22
    .line 23
    new-instance v0, Lcom/facebook/jni/DestructorThread$1;

    .line 24
    .line 25
    const-string v1, "HybridData DestructorThread"

    .line 26
    .line 27
    invoke-direct {v0, v1}, Lcom/facebook/jni/DestructorThread$1;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    sput-object v0, Lcom/facebook/jni/DestructorThread;->sThread:Ljava/lang/Thread;

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 33
    .line 34
    .line 35
    return-void
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$000()Ljava/lang/ref/ReferenceQueue;
    .locals 1

    sget-object v0, Lcom/facebook/jni/DestructorThread;->sReferenceQueue:Ljava/lang/ref/ReferenceQueue;

    return-object v0
.end method

.method static synthetic access$100()Lcom/facebook/jni/DestructorThread$DestructorStack;
    .locals 1

    sget-object v0, Lcom/facebook/jni/DestructorThread;->sDestructorStack:Lcom/facebook/jni/DestructorThread$DestructorStack;

    return-object v0
.end method

.method static synthetic access$700()Lcom/facebook/jni/DestructorThread$DestructorList;
    .locals 1

    sget-object v0, Lcom/facebook/jni/DestructorThread;->sDestructorList:Lcom/facebook/jni/DestructorThread$DestructorList;

    return-object v0
.end method
