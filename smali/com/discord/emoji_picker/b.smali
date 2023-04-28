.class public final synthetic Lcom/discord/emoji_picker/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field public final synthetic k:Lcom/discord/emoji_picker/EmojiPickerRowView;

.field public final synthetic l:Lcom/discord/emoji_picker/EmojiPickerRow$Emoji;


# direct methods
.method public synthetic constructor <init>(Lcom/discord/emoji_picker/EmojiPickerRowView;Lcom/discord/emoji_picker/EmojiPickerRow$Emoji;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/discord/emoji_picker/b;->k:Lcom/discord/emoji_picker/EmojiPickerRowView;

    iput-object p2, p0, Lcom/discord/emoji_picker/b;->l:Lcom/discord/emoji_picker/EmojiPickerRow$Emoji;

    return-void
.end method


# virtual methods
.method public final onLongClick(Landroid/view/View;)Z
    .locals 2

    iget-object v0, p0, Lcom/discord/emoji_picker/b;->k:Lcom/discord/emoji_picker/EmojiPickerRowView;

    iget-object v1, p0, Lcom/discord/emoji_picker/b;->l:Lcom/discord/emoji_picker/EmojiPickerRow$Emoji;

    invoke-static {v0, v1, p1}, Lcom/discord/emoji_picker/EmojiPickerRowView;->b(Lcom/discord/emoji_picker/EmojiPickerRowView;Lcom/discord/emoji_picker/EmojiPickerRow$Emoji;Landroid/view/View;)Z

    move-result p1

    return p1
.end method
