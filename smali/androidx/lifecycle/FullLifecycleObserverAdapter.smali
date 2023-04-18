.class Landroidx/lifecycle/FullLifecycleObserverAdapter;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/j;


# instance fields
.field private final k:Landroidx/lifecycle/e;

.field private final l:Landroidx/lifecycle/j;


# direct methods
.method constructor <init>(Landroidx/lifecycle/e;Landroidx/lifecycle/j;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/lifecycle/FullLifecycleObserverAdapter;->k:Landroidx/lifecycle/e;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/lifecycle/FullLifecycleObserverAdapter;->l:Landroidx/lifecycle/j;

    .line 7
    .line 8
    return-void
    .line 9
    .line 10
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
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method


# virtual methods
.method public c(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$b;)V
    .locals 2

    .line 1
    sget-object v0, Landroidx/lifecycle/FullLifecycleObserverAdapter$a;->a:[I

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    aget v0, v0, v1

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :pswitch_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 14
    .line 15
    const-string p2, "ON_ANY must not been send by anybody"

    .line 16
    .line 17
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw p1

    .line 21
    :pswitch_1
    iget-object v0, p0, Landroidx/lifecycle/FullLifecycleObserverAdapter;->k:Landroidx/lifecycle/e;

    .line 22
    .line 23
    invoke-interface {v0, p1}, Landroidx/lifecycle/e;->onDestroy(Landroidx/lifecycle/LifecycleOwner;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :pswitch_2
    iget-object v0, p0, Landroidx/lifecycle/FullLifecycleObserverAdapter;->k:Landroidx/lifecycle/e;

    .line 28
    .line 29
    invoke-interface {v0, p1}, Landroidx/lifecycle/e;->onStop(Landroidx/lifecycle/LifecycleOwner;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :pswitch_3
    iget-object v0, p0, Landroidx/lifecycle/FullLifecycleObserverAdapter;->k:Landroidx/lifecycle/e;

    .line 34
    .line 35
    invoke-interface {v0, p1}, Landroidx/lifecycle/e;->onPause(Landroidx/lifecycle/LifecycleOwner;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :pswitch_4
    iget-object v0, p0, Landroidx/lifecycle/FullLifecycleObserverAdapter;->k:Landroidx/lifecycle/e;

    .line 40
    .line 41
    invoke-interface {v0, p1}, Landroidx/lifecycle/e;->onResume(Landroidx/lifecycle/LifecycleOwner;)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :pswitch_5
    iget-object v0, p0, Landroidx/lifecycle/FullLifecycleObserverAdapter;->k:Landroidx/lifecycle/e;

    .line 46
    .line 47
    invoke-interface {v0, p1}, Landroidx/lifecycle/e;->onStart(Landroidx/lifecycle/LifecycleOwner;)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :pswitch_6
    iget-object v0, p0, Landroidx/lifecycle/FullLifecycleObserverAdapter;->k:Landroidx/lifecycle/e;

    .line 52
    .line 53
    invoke-interface {v0, p1}, Landroidx/lifecycle/e;->onCreate(Landroidx/lifecycle/LifecycleOwner;)V

    .line 54
    .line 55
    .line 56
    :goto_0
    iget-object v0, p0, Landroidx/lifecycle/FullLifecycleObserverAdapter;->l:Landroidx/lifecycle/j;

    .line 57
    .line 58
    if-eqz v0, :cond_0

    .line 59
    .line 60
    invoke-interface {v0, p1, p2}, Landroidx/lifecycle/j;->c(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$b;)V

    .line 61
    .line 62
    .line 63
    :cond_0
    return-void

    .line 64
    nop

    .line 65
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method
