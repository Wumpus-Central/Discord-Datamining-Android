.class public final synthetic Lcom/discord/segmented/control/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic k:Lcom/discord/segmented/control/SegmentedControlView;

.field public final synthetic l:I

.field public final synthetic m:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/discord/segmented/control/SegmentedControlView;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/discord/segmented/control/a;->k:Lcom/discord/segmented/control/SegmentedControlView;

    iput p2, p0, Lcom/discord/segmented/control/a;->l:I

    iput-object p3, p0, Lcom/discord/segmented/control/a;->m:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    iget-object v0, p0, Lcom/discord/segmented/control/a;->k:Lcom/discord/segmented/control/SegmentedControlView;

    iget v1, p0, Lcom/discord/segmented/control/a;->l:I

    iget-object v2, p0, Lcom/discord/segmented/control/a;->m:Ljava/lang/String;

    invoke-static {v0, v1, v2, p1}, Lcom/discord/segmented/control/SegmentedControlView;->a(Lcom/discord/segmented/control/SegmentedControlView;ILjava/lang/String;Landroid/view/View;)V

    return-void
.end method
