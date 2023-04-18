.class public final synthetic Landroidx/emoji2/text/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Landroidx/emoji2/text/i$b;


# direct methods
.method public synthetic constructor <init>(Landroidx/emoji2/text/i$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/emoji2/text/j;->k:Landroidx/emoji2/text/i$b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Landroidx/emoji2/text/j;->k:Landroidx/emoji2/text/i$b;

    invoke-virtual {v0}, Landroidx/emoji2/text/i$b;->c()V

    return-void
.end method
