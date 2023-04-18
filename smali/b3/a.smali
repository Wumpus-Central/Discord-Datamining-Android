.class public final synthetic Lb3/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic k:Lcom/discord/chat/presentation/deserializationerror/DeserializationErrorView;

.field public final synthetic l:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/discord/chat/presentation/deserializationerror/DeserializationErrorView;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb3/a;->k:Lcom/discord/chat/presentation/deserializationerror/DeserializationErrorView;

    iput-object p2, p0, Lb3/a;->l:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lb3/a;->k:Lcom/discord/chat/presentation/deserializationerror/DeserializationErrorView;

    iget-object v1, p0, Lb3/a;->l:Ljava/lang/String;

    invoke-static {v0, v1, p1}, Lcom/discord/chat/presentation/deserializationerror/DeserializationErrorView;->a(Lcom/discord/chat/presentation/deserializationerror/DeserializationErrorView;Ljava/lang/String;Landroid/view/View;)V

    return-void
.end method
