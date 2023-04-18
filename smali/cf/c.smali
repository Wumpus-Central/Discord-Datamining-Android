.class public final synthetic Lcf/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lcf/d;


# direct methods
.method public synthetic constructor <init>(Lcf/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcf/c;->k:Lcf/d;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcf/c;->k:Lcf/d;

    invoke-static {v0}, Lcf/d;->a(Lcf/d;)V

    return-void
.end method
