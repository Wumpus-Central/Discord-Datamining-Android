.class public abstract Lcom/facebook/jni/DestructorThread$Destructor;
.super Ljava/lang/ref/PhantomReference;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/jni/DestructorThread;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Destructor"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/ref/PhantomReference<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field private next:Lcom/facebook/jni/DestructorThread$Destructor;

.field private previous:Lcom/facebook/jni/DestructorThread$Destructor;


# direct methods
.method private constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    .line 4
    invoke-static {}, Lcom/facebook/jni/DestructorThread;->access$000()Ljava/lang/ref/ReferenceQueue;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Ljava/lang/ref/PhantomReference;-><init>(Ljava/lang/Object;Ljava/lang/ref/ReferenceQueue;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/jni/DestructorThread$1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/jni/DestructorThread$Destructor;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 1

    .line 2
    invoke-static {}, Lcom/facebook/jni/DestructorThread;->access$000()Ljava/lang/ref/ReferenceQueue;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Ljava/lang/ref/PhantomReference;-><init>(Ljava/lang/Object;Ljava/lang/ref/ReferenceQueue;)V

    .line 3
    invoke-static {}, Lcom/facebook/jni/DestructorThread;->access$100()Lcom/facebook/jni/DestructorThread$DestructorStack;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/facebook/jni/DestructorThread$DestructorStack;->push(Lcom/facebook/jni/DestructorThread$Destructor;)V

    return-void
.end method

.method static synthetic access$300(Lcom/facebook/jni/DestructorThread$Destructor;)Lcom/facebook/jni/DestructorThread$Destructor;
    .locals 0

    iget-object p0, p0, Lcom/facebook/jni/DestructorThread$Destructor;->previous:Lcom/facebook/jni/DestructorThread$Destructor;

    return-object p0
.end method

.method static synthetic access$302(Lcom/facebook/jni/DestructorThread$Destructor;Lcom/facebook/jni/DestructorThread$Destructor;)Lcom/facebook/jni/DestructorThread$Destructor;
    .locals 0

    iput-object p1, p0, Lcom/facebook/jni/DestructorThread$Destructor;->previous:Lcom/facebook/jni/DestructorThread$Destructor;

    return-object p1
.end method

.method static synthetic access$600(Lcom/facebook/jni/DestructorThread$Destructor;)Lcom/facebook/jni/DestructorThread$Destructor;
    .locals 0

    iget-object p0, p0, Lcom/facebook/jni/DestructorThread$Destructor;->next:Lcom/facebook/jni/DestructorThread$Destructor;

    return-object p0
.end method

.method static synthetic access$602(Lcom/facebook/jni/DestructorThread$Destructor;Lcom/facebook/jni/DestructorThread$Destructor;)Lcom/facebook/jni/DestructorThread$Destructor;
    .locals 0

    iput-object p1, p0, Lcom/facebook/jni/DestructorThread$Destructor;->next:Lcom/facebook/jni/DestructorThread$Destructor;

    return-object p1
.end method


# virtual methods
.method protected abstract destruct()V
.end method
