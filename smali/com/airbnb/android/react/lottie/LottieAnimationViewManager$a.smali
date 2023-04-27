.class Lcom/airbnb/android/react/lottie/LottieAnimationViewManager$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;->createViewInstance(Lcom/facebook/react/uimanager/ThemedReactContext;)Lh2/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lh2/h;

.field final synthetic b:Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;


# direct methods
.method constructor <init>(Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;Lh2/h;)V
    .locals 0

    iput-object p1, p0, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager$a;->b:Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;

    iput-object p2, p0, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager$a;->a:Lh2/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 2

    iget-object p1, p0, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager$a;->b:Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;

    iget-object v0, p0, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager$a;->a:Lh2/h;

    const/4 v1, 0x1

    invoke-static {p1, v0, v1}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;->access$000(Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;Lh2/h;Z)V

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2

    iget-object p1, p0, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager$a;->b:Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;

    iget-object v0, p0, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager$a;->a:Lh2/h;

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;->access$000(Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;Lh2/h;Z)V

    return-void
.end method

.method public onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method
