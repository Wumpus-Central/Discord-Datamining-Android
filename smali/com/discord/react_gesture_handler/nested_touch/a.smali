.class public final synthetic Lcom/discord/react_gesture_handler/nested_touch/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field public final synthetic k:Landroid/view/View$OnLongClickListener;


# direct methods
.method public synthetic constructor <init>(Landroid/view/View$OnLongClickListener;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/discord/react_gesture_handler/nested_touch/a;->k:Landroid/view/View$OnLongClickListener;

    return-void
.end method


# virtual methods
.method public final onLongClick(Landroid/view/View;)Z
    .locals 1

    iget-object v0, p0, Lcom/discord/react_gesture_handler/nested_touch/a;->k:Landroid/view/View$OnLongClickListener;

    invoke-static {v0, p1}, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchUtilsKt;->a(Landroid/view/View$OnLongClickListener;Landroid/view/View;)Z

    move-result p1

    return p1
.end method
