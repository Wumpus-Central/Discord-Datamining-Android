.class Lcom/airbnb/android/react/lottie/LottieAnimationViewManager$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;->receiveCommand(Lg2/h;ILcom/facebook/react/bridge/ReadableArray;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic k:Lg2/h;

.field final synthetic l:Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;


# direct methods
.method constructor <init>(Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;Lg2/h;)V
    .locals 0

    iput-object p1, p0, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager$c;->l:Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;

    iput-object p2, p0, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager$c;->k:Lg2/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager$c;->k:Lg2/h;

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/core/view/w0;->T(Landroid/view/View;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager$c;->k:Lg2/h;

    .line 10
    .line 11
    invoke-virtual {v0}, Lg2/h;->k()V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager$c;->k:Lg2/h;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-virtual {v0, v1}, Lg2/h;->setProgress(F)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
.end method
