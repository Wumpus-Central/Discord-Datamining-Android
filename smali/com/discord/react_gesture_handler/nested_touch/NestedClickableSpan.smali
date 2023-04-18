.class public interface abstract Lcom/discord/react_gesture_handler/nested_touch/NestedClickableSpan;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/react_gesture_handler/nested_touch/NestedClickableSpan$TouchPriority;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001:\u0001\u000fJ\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u000cH&J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u000cH&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/discord/react_gesture_handler/nested_touch/NestedClickableSpan;",
        "",
        "touchPriority",
        "Lcom/discord/react_gesture_handler/nested_touch/NestedClickableSpan$TouchPriority;",
        "getTouchPriority",
        "()Lcom/discord/react_gesture_handler/nested_touch/NestedClickableSpan$TouchPriority;",
        "enableHighlight",
        "",
        "textView",
        "Landroid/widget/TextView;",
        "onClick",
        "view",
        "Landroid/view/View;",
        "onLongClick",
        "",
        "TouchPriority",
        "react_gesture_handler_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract enableHighlight(Landroid/widget/TextView;)V
.end method

.method public abstract getTouchPriority()Lcom/discord/react_gesture_handler/nested_touch/NestedClickableSpan$TouchPriority;
.end method

.method public abstract onClick(Landroid/view/View;)V
.end method

.method public abstract onLongClick(Landroid/view/View;)Z
.end method
