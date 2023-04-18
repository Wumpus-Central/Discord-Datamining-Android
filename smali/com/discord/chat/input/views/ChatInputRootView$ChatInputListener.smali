.class public interface abstract Lcom/discord/chat/input/views/ChatInputRootView$ChatInputListener;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/discord/chat/input/views/ChatInputRootView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "ChatInputListener"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008f\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0008\u001a\u00020\tH&J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u000c\u001a\u00020\u0005H&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0008\u0010\u0010\u001a\u00020\u0003H&J(\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u000c\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tH&\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/discord/chat/input/views/ChatInputRootView$ChatInputListener;",
        "",
        "onContentSizeChange",
        "",
        "width",
        "",
        "height",
        "onEndBlur",
        "text",
        "",
        "onFocus",
        "start",
        "end",
        "onImageInserted",
        "uri",
        "Landroid/net/Uri;",
        "onRequestSend",
        "onTextOrSelectionChanged",
        "editId",
        "chat_input_release"
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
.method public abstract onContentSizeChange(II)V
.end method

.method public abstract onEndBlur(Ljava/lang/String;)V
.end method

.method public abstract onFocus(II)V
.end method

.method public abstract onImageInserted(Landroid/net/Uri;)V
.end method

.method public abstract onRequestSend()V
.end method

.method public abstract onTextOrSelectionChanged(IILjava/lang/String;Ljava/lang/String;)V
.end method
