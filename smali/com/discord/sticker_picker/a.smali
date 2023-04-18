.class public final synthetic Lcom/discord/sticker_picker/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic k:Lcom/discord/sticker_picker/StickerPickerRowView;

.field public final synthetic l:Lcom/discord/sticker_picker/StickerPickerRow$Sticker;


# direct methods
.method public synthetic constructor <init>(Lcom/discord/sticker_picker/StickerPickerRowView;Lcom/discord/sticker_picker/StickerPickerRow$Sticker;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/discord/sticker_picker/a;->k:Lcom/discord/sticker_picker/StickerPickerRowView;

    iput-object p2, p0, Lcom/discord/sticker_picker/a;->l:Lcom/discord/sticker_picker/StickerPickerRow$Sticker;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/discord/sticker_picker/a;->k:Lcom/discord/sticker_picker/StickerPickerRowView;

    iget-object v1, p0, Lcom/discord/sticker_picker/a;->l:Lcom/discord/sticker_picker/StickerPickerRow$Sticker;

    invoke-static {v0, v1, p1}, Lcom/discord/sticker_picker/StickerPickerRowView;->a(Lcom/discord/sticker_picker/StickerPickerRowView;Lcom/discord/sticker_picker/StickerPickerRow$Sticker;Landroid/view/View;)V

    return-void
.end method
