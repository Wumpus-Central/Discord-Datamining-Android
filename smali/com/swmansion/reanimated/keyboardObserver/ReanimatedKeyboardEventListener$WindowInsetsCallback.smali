.class Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener$WindowInsetsCallback;
.super Landroidx/core/view/t2$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "WindowInsetsCallback"
.end annotation


# instance fields
.field private keyboardHeight:I

.field final synthetic this$0:Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener;


# direct methods
.method public constructor <init>(Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener$WindowInsetsCallback;->this$0:Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    invoke-direct {p0, p1}, Landroidx/core/view/t2$b;-><init>(I)V

    .line 5
    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    iput p1, p0, Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener$WindowInsetsCallback;->keyboardHeight:I

    .line 9
    .line 10
    return-void
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
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
.end method


# virtual methods
.method public onEnd(Landroidx/core/view/t2;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener$WindowInsetsCallback;->this$0:Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener;

    .line 2
    .line 3
    iget v0, p0, Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener$WindowInsetsCallback;->keyboardHeight:I

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    sget-object v0, Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener$KeyboardState;->CLOSED:Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener$KeyboardState;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    sget-object v0, Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener$KeyboardState;->OPEN:Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener$KeyboardState;

    .line 11
    .line 12
    :goto_0
    invoke-static {p1, v0}, Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener;->access$002(Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener;Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener$KeyboardState;)Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener$KeyboardState;

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener$WindowInsetsCallback;->this$0:Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener;

    .line 16
    .line 17
    iget v0, p0, Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener$WindowInsetsCallback;->keyboardHeight:I

    .line 18
    .line 19
    invoke-static {p1, v0}, Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener;->access$100(Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener;I)V

    .line 20
    .line 21
    .line 22
    return-void
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
.end method

.method public onProgress(Landroidx/core/view/WindowInsetsCompat;Ljava/util/List;)Landroidx/core/view/WindowInsetsCompat;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/core/view/WindowInsetsCompat;",
            "Ljava/util/List<",
            "Landroidx/core/view/t2;",
            ">;)",
            "Landroidx/core/view/WindowInsetsCompat;"
        }
    .end annotation

    .line 1
    invoke-static {}, Landroidx/core/view/WindowInsetsCompat$m;->b()I

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    invoke-virtual {p1, p2}, Landroidx/core/view/WindowInsetsCompat;->f(I)Landroidx/core/graphics/Insets;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    iget p2, p2, Landroidx/core/graphics/Insets;->d:I

    .line 10
    .line 11
    invoke-static {}, Landroidx/core/view/WindowInsetsCompat$m;->g()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-virtual {p1, v0}, Landroidx/core/view/WindowInsetsCompat;->f(I)Landroidx/core/graphics/Insets;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget v0, v0, Landroidx/core/graphics/Insets;->d:I

    .line 20
    .line 21
    sub-int/2addr p2, v0

    .line 22
    const/4 v0, 0x0

    .line 23
    invoke-static {v0, p2}, Ljava/lang/Math;->max(II)I

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    int-to-float p2, p2

    .line 28
    invoke-static {p2}, Lcom/facebook/react/uimanager/PixelUtil;->toDIPFromPixel(F)F

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    float-to-int p2, p2

    .line 33
    iput p2, p0, Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener$WindowInsetsCallback;->keyboardHeight:I

    .line 34
    .line 35
    iget-object v0, p0, Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener$WindowInsetsCallback;->this$0:Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener;

    .line 36
    .line 37
    invoke-static {v0, p2}, Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener;->access$100(Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener;I)V

    .line 38
    .line 39
    .line 40
    return-object p1
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
.end method

.method public onStart(Landroidx/core/view/t2;Landroidx/core/view/t2$a;)Landroidx/core/view/t2$a;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener$WindowInsetsCallback;->this$0:Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener;

    .line 2
    .line 3
    iget v1, p0, Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener$WindowInsetsCallback;->keyboardHeight:I

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    sget-object v1, Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener$KeyboardState;->OPENING:Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener$KeyboardState;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    sget-object v1, Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener$KeyboardState;->CLOSING:Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener$KeyboardState;

    .line 11
    .line 12
    :goto_0
    invoke-static {v0, v1}, Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener;->access$002(Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener;Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener$KeyboardState;)Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener$KeyboardState;

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener$WindowInsetsCallback;->this$0:Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener;

    .line 16
    .line 17
    iget v1, p0, Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener$WindowInsetsCallback;->keyboardHeight:I

    .line 18
    .line 19
    invoke-static {v0, v1}, Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener;->access$100(Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener;I)V

    .line 20
    .line 21
    .line 22
    invoke-super {p0, p1, p2}, Landroidx/core/view/t2$b;->onStart(Landroidx/core/view/t2;Landroidx/core/view/t2$a;)Landroidx/core/view/t2$a;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1
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
.end method
