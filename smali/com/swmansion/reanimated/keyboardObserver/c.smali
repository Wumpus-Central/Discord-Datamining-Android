.class public final synthetic Lcom/swmansion/reanimated/keyboardObserver/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener;


# direct methods
.method public synthetic constructor <init>(Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/swmansion/reanimated/keyboardObserver/c;->k:Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/swmansion/reanimated/keyboardObserver/c;->k:Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener;

    invoke-static {v0}, Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener;->b(Lcom/swmansion/reanimated/keyboardObserver/ReanimatedKeyboardEventListener;)V

    return-void
.end method
